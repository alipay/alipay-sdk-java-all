package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 根据bizId查询单个人的权益情况
 *
 * @author auto create
 * @since 1.0, 2024-04-12 14:26:16
 */
public class EapAuthVO extends AlipayObject {

	private static final long serialVersionUID = 3245931915981963143L;

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

	/**
	 * 该参数用来标识用户来源，是供应商不同的场景传入对应的来源，蚂蚁EAP会根据此来判断员工是否在权益范围内
	 */
	@ApiField("source")
	private Long source;

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

	public Long getSource() {
		return this.source;
	}
	public void setSource(Long source) {
		this.source = source;
	}

}
