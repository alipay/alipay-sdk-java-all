package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.InsProduct;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.product.access.apply response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 15:51:36
 */
public class AlipayInsSceneProductAccessApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 3484787981746313124L;

	/** 
	 * true 表示可以准入， false表示不可以准入。
当准入结果为false的时候需要提示用户当前不能购买该产品
	 */
	@ApiField("is_access")
	private Boolean isAccess;

	/** 
	 * 产品信息(保险标准查询信息)
	 */
	@ApiField("product")
	private InsProduct product;

	/** 
	 * 不准入原因，该原因为统一的风控原因，用于上游日志使用，不能直接提示给用户，建议给用户的提示文案和蚂蚁PD沟通后给出。
该字段在系统异常的情况下为空
	 */
	@ApiField("reason")
	private String reason;

	public void setIsAccess(Boolean isAccess) {
		this.isAccess = isAccess;
	}
	public Boolean getIsAccess( ) {
		return this.isAccess;
	}

	public void setProduct(InsProduct product) {
		this.product = product;
	}
	public InsProduct getProduct( ) {
		return this.product;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}
	public String getReason( ) {
		return this.reason;
	}

}
