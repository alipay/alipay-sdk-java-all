package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 获取云凤蝶站点列表返回值模型
 *
 * @author auto create
 * @since 1.0, 2018-10-22 16:58:45
 */
public class FengdieSitesListRespModel extends AlipayObject {

	private static final long serialVersionUID = 5869237643516372439L;

	/**
	 * 云凤蝶站点数据列表
	 */
	@ApiListField("list")
	@ApiField("fengdie_sites_list_model")
	private List<FengdieSitesListModel> list;

	/**
	 * 分页数据信息，包含总数，分页数，当前页码，请求每页的数量
	 */
	@ApiField("paginator")
	private FengdieListPaginator paginator;

	public List<FengdieSitesListModel> getList() {
		return this.list;
	}
	public void setList(List<FengdieSitesListModel> list) {
		this.list = list;
	}

	public FengdieListPaginator getPaginator() {
		return this.paginator;
	}
	public void setPaginator(FengdieListPaginator paginator) {
		this.paginator = paginator;
	}

}
