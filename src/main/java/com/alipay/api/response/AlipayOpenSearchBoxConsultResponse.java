package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.search.box.consult response.
 * 
 * @author auto create
 * @since 1.0, 2022-08-09 11:05:24
 */
public class AlipayOpenSearchBoxConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 7327759647118589733L;

	/** 
	 * 是否准入，false代表不准入
	 */
	@ApiField("access")
	private Boolean access;

	/** 
	 * 不准入项列表。不准入项用字符串描述，可参照接口文档和<a href="https://opendocs.alipay.com/pre-open/0311q3#%E5%87%86%E5%85%A5%E6%9D%A1%E4%BB%B6">准入条件</a>，进行调整以达到申请要求
	 */
	@ApiListField("not_pass_items")
	@ApiField("string")
	private List<String> notPassItems;

	public void setAccess(Boolean access) {
		this.access = access;
	}
	public Boolean getAccess( ) {
		return this.access;
	}

	public void setNotPassItems(List<String> notPassItems) {
		this.notPassItems = notPassItems;
	}
	public List<String> getNotPassItems( ) {
		return this.notPassItems;
	}

}
