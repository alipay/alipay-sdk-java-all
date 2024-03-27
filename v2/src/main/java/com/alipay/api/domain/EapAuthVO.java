package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 根据bizId查询单个人的权益情况
 *
 * @author auto create
 * @since 1.0, 2024-03-25 21:10:54
 */
public class EapAuthVO extends AlipayObject {

	private static final long serialVersionUID = 3649371871455431862L;

	/**
	 * 该参数用来标识团餐所属组织，是根据用户corp按照组织归属转换得来，供应商会依据此参数合计账单。
	 */
	@ApiField("corp")
	private String corp;

	/**
	 * 该字段用来判断用户是否有权益查看蚂蚁套餐内容，是根据用户查询授权信息，若有授权，则具有权益，返回true，反之返回false。供应商会依据此参数，判断页面中是否展示蚂蚁套餐内容。
	 */
	@ApiField("has_auth")
	private Boolean hasAuth;

	public String getCorp() {
		return this.corp;
	}
	public void setCorp(String corp) {
		this.corp = corp;
	}

	public Boolean getHasAuth() {
		return this.hasAuth;
	}
	public void setHasAuth(Boolean hasAuth) {
		this.hasAuth = hasAuth;
	}

}
