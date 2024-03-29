package com.xuecheng.api.cms;

import com.xuecheng.framework.domain.cms.request.QueryPageRequest;
import com.xuecheng.framework.model.response.QueryResponseResult;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

public interface CmsPageControllerApi {

    //页面查询接口
    @ApiOperation("分页查询页面列表")
    @ApiImplicitParams({
    @ApiImplicitParam(name = "page", value = "页码", required = true, paramType = " path", dataType = "int"),
    @ApiImplicitParam(name = "size", value = "每页记录数", required = true, paramType = " path", dataType = "int")})
    public QueryResponseResult findList(int page, int size, QueryPageRequest queryPageRequest);

}
