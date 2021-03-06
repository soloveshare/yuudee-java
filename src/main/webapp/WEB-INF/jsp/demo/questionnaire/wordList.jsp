<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/16
  Time: 19:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/static/common/taglibs.jsp" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>文案建议设置列表</title>
    <%@ include file="/WEB-INF/jsp/demo/public/headCssJs.jsp"%>
</head>
<body>
<div class="wrapper">
    <%@ include file="/WEB-INF/jsp/demo/public/menu.jsp"%>
    <%@ include file="/WEB-INF/jsp/demo/public/pageTop.jsp"%>
    <div id="page-wrapper" class="gray-bg">
        <div class="container-fluid">
            <div class="row" style="margin-left: 10px;margin-top: 20px;">
                <div style="line-height: 34px;display: inline-block;">
                    <label>问卷类型</label>
                    <div style="width: 200px;display: inline-block;margin: 0px 20px 0px 10px;">
                        <select id="type" class="form-control" name="type">
                            <option value="">全部</option>
                            <option value="1">pcdi问卷</option>
                            <option value="2">abc问卷</option>
                        </select>
                    </div>
                </div>
                <div style="display: inline-block;margin-left: 20px;">
                    <button class="btn btn-success bt-search">查询</button>
                </div>
            </div>
            <div class="row" style="margin-left: 10px;margin-top: 20px;">
                <div style="display: inline-block;margin-left: 20px;">
                    <button class="btn btn-success bt-add">添加</button>
                </div>
            </div>
        </div>
        <div class="wrapper wrapper-content animated fadeInRight">
            <table class="table table-striped table-bordered table-hover dataTables-example" id="data-table" >
            </table>
        </div>
    </div>

</div>

<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="wrapper wrapper-content animated fadeInRight" id="divTable1">
                <div class="form-group">
                    <label class="col-sm-2 control-label">题号:</label>
                    <%--占七列 并且造一个input组--%>
                    <div class="col-sm-3 input-group">
                        <input name="id" id="vabId" hidden class="vabId">
                        <input type="text" name="sort" id="sort"  class="form-control">
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-2 control-label">题目:</label>
                    <%--占七列 并且造一个input组--%>
                    <div class="col-sm-3 input-group">
                        <textarea name="Name" id="vabName" rows="4" cols="40" onpropertychange="if(this.scrollHeight>80) this.style.posHeight=this.scrollHeight+5"></textarea>
                    </div>
                </div>
                <div class="modal-footer">
                    <a href="javascript:;" class="btn btn-sm btn-white" data-dismiss="modal">关闭</a>
                    <button  class="btn btn-sm btn-addOK">确定</button>
                </div>
            </div>
        </div>
    </div>
</div>

</body>
</html>
<script >
    $(document).ready(function () {
        var type ;
        var topictitle ;
        var conf_dt = {
            paging: true,//分页
            ordering: false,//是否启用排序
            searching: false,//搜索
            //lengthMenu: [25, 50],
            scrollX: "100%",
            displayLength:10,
            language: {
                lengthMenu: '<div class="dataTables_length" id="data-table_length"><label>展示<select name="data-table_length" aria-controls="data-table" class="">'+'<option value="10">10</option>'  + '<option value="20">20</option>' + '<option value="30">30</option>' + '<option value="100">100</option>'+'</select>条记录</laber></div></div>',
//                + '<button class="sendEmail btn btn-success" style="margin-left: 10px">发送邮件</button></div>',
                search: '<span class="label label-success"></span>',//右上角的搜索文本，可以写html标签
                paginate: {//分页的样式内容。
                    previous: "上一页",
                    next: "下一页",
                    first: "第一页",
                    last: "最后"
                },
                zeroRecords: "没有内容",//table tbody内容为空时，tbody的内容。
                //下面三者构成了总体的左下角的内容。
                info: "总共_PAGES_ 页，显示第_START_ 到第 _END_ ，筛选之后得到 _TOTAL_ 条，初始_MAX_ 条 ",//左下角的信息显示，大写的词为关键字。
                infoEmpty: "0条记录",//筛选为空时左下角的显示。
                infoFiltered: "",//筛选之后的左下角筛选提示，
            },
            paging: true,
            pagingType: "full_numbers",//分页样式的类型
            columns: [
              /*  {
                    sTitle: '序号',
                    data: null,
                    className: 'text-center whiteSpace',
                    render:function(data,type,row,meta) {
                        return meta.row + 1 +
                            meta.settings._iDisplayStart;
                    }
                },*/
                {
                    "title": "ID",
                    "type": "html",
                    "data": "id",
                    "defaultContent": "",
                    "name": "id"
                },
                {
                    "title": "类型",
                    "type": "html",
                    "data": "type",
                    "defaultContent": "",
                    "name": "type",
                    "render": function (data, type, full, meta) {
                        if (data == "1"){
                            return "pcdi问卷";
                        }else {
                            return "abc问卷";
                        }
                    }
                },
                {
                    "title": "是否选做",
                    "type": "html",
                    "data": "isOptional",
                    "defaultContent": "",
                    "name": "isOptional",
                    "render": function (data, type, full, meta) {
                        if (data == "1"){
                            return "必做";
                        }
                        if (data == "2"){
                            return "选做";
                        }
                        return  "-";
                    }
                },
                {
                    "title": "儿童性别",
                    "type": "html",
                    "data": "sex",
                    "defaultContent": "",
                    "name": "sex",
                    "render": function (data, type, full, meta) {
                        if (data == "0"){
                            return "男孩";
                        }
                        if (data == "1"){
                            return "女孩";
                        }
                    }
                },
                {
                    "title": "起始值",
                    "type": "html",
                    "data": "state",
                    "defaultContent": "",
                    "name": "state"
                },
                {
                    "title": "结束值",
                    "type": "html",
                    "data": "end",
                    "defaultContent": "",
                    "name": "end"
                },
                {
                    "title": "文案",
                    "type": "html",
                    "data": "content",
                    "defaultContent": "",
                    "name": "content",
                    "render": function (data, type, full, meta) {
                        if (data.length > 50){
                            return data.substring(0,50)+"..."
                        }
                        return data;
                    }
                },
                {
                    "title": "创建时间",
                    "type": "html",
                    "data": "createTime",
                    "defaultContent": "",
                    "name": "createTime",
                    "render": function (data, type, full, meta) {
                        return timestampToTime(data/1000);
                    }
                },
                {
                    "title": "更新时间",
                    "type": "html",
                    "data": "updateTime",
                    "defaultContent": "",
                    "name": "updateTime",
                    "render": function (data, type, full, meta) {
                        if (data == null){
                            return "";
                        }
                        return timestampToTime(data/1000);
                    }
                },
                {
                    "title": "操作",
                    "type": "num",
                    "data": "id",
                    "defaultContent": "",
                    "name": "id",
                    "render": function (data, type, full, meta) {
                        var ret = '<button style="margin-right: 5px;" class=" btn btn-success btn-xs  btn-edit" id="' + data +
                            '">编辑</button>'+
                            '<button style="margin-right: 5px;" class=" btn btn-success btn-xs   btn-delete" id="' + data +
                            '">删除</button>';
                        return ret;
                    }
                }
            ],
            serverSide: true,
            ajax: {
                "url": "${path}/manage/roll/toWordList.ajax",
                "data": function (d) {
                    d.type = type;
                    d.topictitle = topictitle;
                }
            },
            "fnDrawCallback":function(obj){
                $('#switchId input').bootstrapSwitch({onText:'正常',offText:'冻结',onSwitchChange:function(){
                    var switch_status=$(this).val();
                    var rowId=$(this).attr("rowId");
                    if(switch_status==0){//正常 变冻结
                        updateStatus(rowId,1);
                    }
                    if(switch_status==1){//冻结 变正常
                        updateStatus(rowId,0);
                    }
                } });
            },
            index: 0
        };
        var $dataTable = $('#data-table').dataTable(conf_dt);
        var id;
        //添加
        $(".bt-add").click(function(){
            window.location.href = "${path}/manage/roll/toWordInfoPage";
        });
        //编辑
        $dataTable.on('click',".btn-edit",function () {
            id= $(this).attr("id");
            window.location.href = "${path}/manage/roll/toWordInfoPage?id="+id;
        });
        //删除
        $dataTable.on('click',".btn-delete",function () {
            id= $(this).attr("id");
            $.ajax({
                url:"${path}/manage/roll/wordDelete",
                dataType:'JSON',
                data:{
                    id:id,
                },
                success: function (data) {
                    console.log(data);
                    if (data.code == 200) {
                        alert(data.msg);
                        window.location.reload();
                    }else {
                        alert(data.msg)
                    }
                }
            });
        });
        $('.bt-search').click(function () {
            type = $("#type").val();;
            topictitle = $("#topictitle").val();
            $dataTable.fnDraw();
        });

        function updateStatus(id,status) {
            $.ajax({
                url:"${path}/manage/account/updateStatus",
                dataType:'JSON',
                data:{
                    id:id,
                    status:status
                },
                success: function (response) {
                    console.log(response);
                    if (response == 200) {
                        $dataTable.fnDraw();
                    }else{
                        alert("出现异常！");
                    }
                }
            });
        }
    });
    $('#side-menu').siblings().removeClass('active');
    $('#msq_Menu').addClass('active');
    $('#msq_Menu4').addClass('active');
</script>
