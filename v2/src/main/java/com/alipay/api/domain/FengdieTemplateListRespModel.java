package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 云凤蝶模板信息列表，包含信息如下：
分页信息，比如当前页数；模板详情列表，比如模板名称
 *
 * @author auto create
 * @since 1.0, 2018-10-22 16:58:36
 */
public class FengdieTemplateListRespModel extends AlipayObject {

	private static final long serialVersionUID = 1597894458526517447L;

	/**
	 * 云凤蝶模板包列表，包含了多个模板信息，模板信息中包含了模板名称、模板拥有者等信息
	 */
	@ApiListField("list")
	@ApiField("fengdie_template_detail_model")
	private List<FengdieTemplateDetailModel> list;

	/**
	 * 返回的分页数据信息，包括项目总数、当前页数、总页数等信息
	 */
	@ApiField("paginator")
	private FengdieListPaginator paginator;

	public List<FengdieTemplateDetailModel> getList() {
		return this.list;
	}
	public void setList(List<FengdieTemplateDetailModel> list) {
		this.list = list;
	}

	public FengdieListPaginator getPaginator() {
		return this.paginator;
	}
	public void setPaginator(FengdieListPaginator paginator) {
		this.paginator = paginator;
	}

}
