package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 加密后的用户身份信息
 *
 * @author auto create
 * @since 1.0, 2026-05-25 18:23:02
 */
public class ZmUserDetailModel extends AlipayObject {

	private static final long serialVersionUID = 7746145932838855292L;

	/**
	 * hash值
	 */
	@ApiField("original_hash")
	private String originalHash;

	/**
	 * 初始向量值
	 */
	@ApiField("original_vector")
	private String originalVector;

	/**
	 * 加密后的数据值
	 */
	@ApiField("secrect_value")
	private String secrectValue;

	/**
	 * 加密后的动态秘钥
	 */
	@ApiField("secret_key")
	private String secretKey;

	public String getOriginalHash() {
		return this.originalHash;
	}
	public void setOriginalHash(String originalHash) {
		this.originalHash = originalHash;
	}

	public String getOriginalVector() {
		return this.originalVector;
	}
	public void setOriginalVector(String originalVector) {
		this.originalVector = originalVector;
	}

	public String getSecrectValue() {
		return this.secrectValue;
	}
	public void setSecrectValue(String secrectValue) {
		this.secrectValue = secrectValue;
	}

	public String getSecretKey() {
		return this.secretKey;
	}
	public void setSecretKey(String secretKey) {
		this.secretKey = secretKey;
	}

}
