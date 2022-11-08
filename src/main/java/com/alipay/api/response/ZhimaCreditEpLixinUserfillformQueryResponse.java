package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.RightsFormItemValues;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.lixin.userfillform.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-11-04 18:12:39
 */
public class ZhimaCreditEpLixinUserfillformQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7316981264962913846L;

	/** 
	 * 分页请求时候是否有下一页
	 */
	@ApiField("has_next")
	private Boolean hasNext;

	/** 
	 * 表单信息列表，列表中一个元素即为用户填写的一张表单信息
	 */
	@ApiListField("item_list")
	@ApiField("rights_form_item_values")
	private List<RightsFormItemValues> itemList;

	/** 
	 * 分页请求的页码
	 */
	@ApiField("page_index")
	private Long pageIndex;

	/** 
	 * 分页请求数据总计页数
	 */
	@ApiField("page_total")
	private Long pageTotal;

	/** 
	 * 权益ID，唯一，企业信用立信平台权益说明页获取
	 */
	@ApiField("rights_id")
	private Long rightsId;

	/** 
	 * 信用报告优惠券，有企业信用业务方自定义，在企业信用立信后台维护，不含有敏感信息
	 */
	@ApiField("rights_name")
	private String rightsName;

	/** 
	 * 分页请求时返回数据总量
	 */
	@ApiField("total")
	private Long total;

	public void setHasNext(Boolean hasNext) {
		this.hasNext = hasNext;
	}
	public Boolean getHasNext( ) {
		return this.hasNext;
	}

	public void setItemList(List<RightsFormItemValues> itemList) {
		this.itemList = itemList;
	}
	public List<RightsFormItemValues> getItemList( ) {
		return this.itemList;
	}

	public void setPageIndex(Long pageIndex) {
		this.pageIndex = pageIndex;
	}
	public Long getPageIndex( ) {
		return this.pageIndex;
	}

	public void setPageTotal(Long pageTotal) {
		this.pageTotal = pageTotal;
	}
	public Long getPageTotal( ) {
		return this.pageTotal;
	}

	public void setRightsId(Long rightsId) {
		this.rightsId = rightsId;
	}
	public Long getRightsId( ) {
		return this.rightsId;
	}

	public void setRightsName(String rightsName) {
		this.rightsName = rightsName;
	}
	public String getRightsName( ) {
		return this.rightsName;
	}

	public void setTotal(Long total) {
		this.total = total;
	}
	public Long getTotal( ) {
		return this.total;
	}

}
