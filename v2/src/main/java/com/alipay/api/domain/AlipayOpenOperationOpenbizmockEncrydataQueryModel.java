package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 测试专用_此接口类型为强制加密接口
 *
 * @author auto create
 * @since 1.0, 2023-05-31 11:39:21
 */
public class AlipayOpenOperationOpenbizmockEncrydataQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1633268882356619181L;

	/**
	 * 测试
	 */
	@ApiField("biz_no")
	private String bizNo;

	/**
	 * 1
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 1
	 */
	@ApiField("uid")
	private String uid;

	public String getBizNo() {
		return this.bizNo;
	}
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getUid() {
		return this.uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}

}
