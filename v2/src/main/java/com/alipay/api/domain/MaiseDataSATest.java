package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 麦瑟测试用数据结构
 *
 * @author auto create
 * @since 1.0, 2023-07-12 17:03:59
 */
public class MaiseDataSATest extends AlipayObject {

	private static final long serialVersionUID = 6187935676594525728L;

	/**
	 * 11
	 */
	@ApiField("key_a")
	private String keyA;

	/**
	 * 1
	 */
	@ApiField("key_b")
	private Boolean keyB;

	/**
	 * 11
	 */
	@ApiField("key_c")
	private Date keyC;

	public String getKeyA() {
		return this.keyA;
	}
	public void setKeyA(String keyA) {
		this.keyA = keyA;
	}

	public Boolean getKeyB() {
		return this.keyB;
	}
	public void setKeyB(Boolean keyB) {
		this.keyB = keyB;
	}

	public Date getKeyC() {
		return this.keyC;
	}
	public void setKeyC(Date keyC) {
		this.keyC = keyC;
	}

}
