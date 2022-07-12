package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 中移动流量增送资格检测
 *
 * @author auto create
 * @since 1.0, 2018-12-29 15:17:57
 */
public class AlipayEbppFlowQualificationDetectModel extends AlipayObject {

	private static final long serialVersionUID = 3751993557889761199L;

	/**
	 * 需要校验的用户手机号
	 */
	@ApiField("mobile")
	private String mobile;

	/**
	 * 需要校验的产品id
	 */
	@ApiListField("product_id")
	@ApiField("string")
	private List<String> productId;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getMobile() {
		return this.mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public List<String> getProductId() {
		return this.productId;
	}
	public void setProductId(List<String> productId) {
		this.productId = productId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
