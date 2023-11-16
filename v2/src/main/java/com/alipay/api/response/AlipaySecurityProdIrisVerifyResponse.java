package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.prod.iris.verify response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-30 22:24:50
 */
public class AlipaySecurityProdIrisVerifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 2634157882333416828L;

	/** 
	 * 虹膜校验关联token，用于二次校验
	 */
	@ApiField("biz_token")
	private String bizToken;

	/** 
	 * 虹膜扩展参数，用于后续扩展，目前没有内容
	 */
	@ApiField("ext_info")
	private String extInfo;

	/** 
	 * 对此次搜索虹膜库分组的虹膜id标识
	 */
	@ApiField("iris_id")
	private String irisId;

	/** 
	 * 用于标识虹膜对应的注册人的id，如支付宝的uid、信用id等等，此处返回虹膜注册时候传入的person_id
	 */
	@ApiField("person_id")
	private String personId;

	/** 
	 * 用于标识本次虹膜校验状态，虹膜校验需要将服务端的校验状态细节同时返回给业务方，-1冻结，-2多个虹膜匹配，17匹配到虹膜
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

	public void setPersonId(String personId) {
		this.personId = personId;
	}
	public String getPersonId( ) {
		return this.personId;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
