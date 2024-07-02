package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.multimedia.resource.masstoken.get response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-21 02:28:22
 */
public class AlipayMultimediaResourceMasstokenGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 2343437993453442899L;

	/** 
	 * token创建时间戳，秒
	 */
	@ApiField("create_time")
	private Long createTime;

	/** 
	 * token失效时间戳，秒
	 */
	@ApiField("dead_time")
	private Long deadTime;

	/** 
	 * 从AFTS系统获取的token参数，用于从AFTS系统上传下载操作时的鉴权参数。示例值仅供参考，无法直接使用。
	 */
	@ApiField("mass_token")
	private String massToken;

	public void setCreateTime(Long createTime) {
		this.createTime = createTime;
	}
	public Long getCreateTime( ) {
		return this.createTime;
	}

	public void setDeadTime(Long deadTime) {
		this.deadTime = deadTime;
	}
	public Long getDeadTime( ) {
		return this.deadTime;
	}

	public void setMassToken(String massToken) {
		this.massToken = massToken;
	}
	public String getMassToken( ) {
		return this.massToken;
	}

}
