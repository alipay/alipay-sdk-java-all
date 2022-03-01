package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.prod.iris.create response.
 * 
 * @author auto create
 * @since 1.0, 2021-07-13 15:44:10
 */
public class AlipaySecurityProdIrisCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2729736178668851517L;

	/** 
	 * 虹膜注册的关联token，用于关联跨设备分次注册
	 */
	@ApiField("biz_token")
	private String bizToken;

	/** 
	 * 虹膜扩展参数，用于后续扩展，目前没有内容
	 */
	@ApiField("ext_info")
	private String extInfo;

	/** 
	 * 对此次插入虹膜库分组的虹膜id标识
	 */
	@ApiField("iris_id")
	private String irisId;

	/** 
	 * 用于标识本次虹膜注册是否已经完成，0：初始状态，1：有person_id，16：有iris_str，17：有person_id和iris_str
	 */
	@ApiField("status")
	private String status;

	public void setBizToken(String bizToken) {
		this.bizToken = bizToken;
	}
	public String getBizToken( ) {
		return this.bizToken;
	}

	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}
	public String getExtInfo( ) {
		return this.extInfo;
	}

	public void setIrisId(String irisId) {
		this.irisId = irisId;
	}
	public String getIrisId( ) {
		return this.irisId;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
