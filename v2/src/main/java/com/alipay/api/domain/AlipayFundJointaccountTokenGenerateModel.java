package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 加签token生成
 *
 * @author auto create
 * @since 1.0, 2025-04-18 15:18:43
 */
public class AlipayFundJointaccountTokenGenerateModel extends AlipayObject {

	private static final long serialVersionUID = 6312935827673845744L;

	/**
	 * 产品码下的业务场景
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * token存储有效期,单位秒
	 */
	@ApiField("expire_time")
	private Long expireTime;

	/**
	 * 业务场景标识JOINT_ACCOUNT
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 外部传入token值，支付宝侧会基于该token进行转换存储，结果返回基于外部传入token处理转换后的token值
	 */
	@ApiField("token_key")
	private String tokenKey;

	/**
	 * 外部传入需要转为token的明文值，例如跳端加签结果
	 */
	@ApiField("token_value")
	private String tokenValue;

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public Long getExpireTime() {
		return this.expireTime;
	}
	public void setExpireTime(Long expireTime) {
		this.expireTime = expireTime;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getTokenKey() {
		return this.tokenKey;
	}
	public void setTokenKey(String tokenKey) {
		this.tokenKey = tokenKey;
	}

	public String getTokenValue() {
		return this.tokenValue;
	}
	public void setTokenValue(String tokenValue) {
		this.tokenValue = tokenValue;
	}

}
