package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.iot.remotecontrol.adb.certify response.
 * 
 * @author auto create
 * @since 1.0, 2019-04-09 21:53:06
 */
public class AlipayCommerceIotRemotecontrolAdbCertifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 3493637233216414385L;

	/** 
	 * adb的一些指令
	 */
	@ApiListField("cmd")
	@ApiField("string")
	private List<String> cmd;

	/** 
	 * adb账号剩余多少秒过期了
	 */
	@ApiField("expire_time")
	private Long expireTime;

	/** 
	 * token的签名数据
	 */
	@ApiField("sign_token")
	private String signToken;

	/** 
	 * 账号能操作的设备id
	 */
	@ApiListField("sn")
	@ApiField("string")
	private List<String> sn;

	public void setCmd(List<String> cmd) {
		this.cmd = cmd;
	}
	public List<String> getCmd( ) {
		return this.cmd;
	}

	public void setExpireTime(Long expireTime) {
		this.expireTime = expireTime;
	}
	public Long getExpireTime( ) {
		return this.expireTime;
	}

	public void setSignToken(String signToken) {
		this.signToken = signToken;
	}
	public String getSignToken( ) {
		return this.signToken;
	}

	public void setSn(List<String> sn) {
		this.sn = sn;
	}
	public List<String> getSn( ) {
		return this.sn;
	}

}
