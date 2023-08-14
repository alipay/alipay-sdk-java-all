package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 云凤蝶空间列表查询接口返回值，包含分页信息，空间信息的列表。
 *
 * @author auto create
 * @since 1.0, 2018-10-22 16:58:26
 */
public class FengdieSpaceListRespModel extends AlipayObject {

	private static final long serialVersionUID = 5671111143928869381L;

	/**
	 * 当前VIP用户下面所有的空间详情列表
	 */
	@ApiListField("list")
	@ApiField("fengdie_space_detail_model")
	private List<FengdieSpaceDetailModel> list;

	/**
	 * 分页数据信息，包含总数，分页数，当前页码，请求每页的数量
	 */
	@ApiField("paginator")
	private FengdieListPaginator paginator;

	public List<FengdieSpaceDetailModel> getList() {
		return this.list;
	}
	public void setList(List<FengdieSpaceDetailModel> list) {
		this.list = list;
	}

	public FengdieListPaginator getPaginator() {
		return this.paginator;
	}
	public void setPaginator(FengdieListPaginator paginator) {
		this.paginator = paginator;
	}

}
