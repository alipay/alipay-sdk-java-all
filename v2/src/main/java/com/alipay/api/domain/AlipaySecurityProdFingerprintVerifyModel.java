package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 指纹校验
 *
 * @author auto create
 * @since 1.0, 2022-07-18 14:40:32
 */
public class AlipaySecurityProdFingerprintVerifyModel extends AlipayObject {

	private static final long serialVersionUID = 8328358558455446568L;

	/**
	 * 业务扩展参数，目前添加指位变更逻辑判断字段，needAuthData标示指位变更敏感，subAction标示当前操作是校验还是更新指位
	 */
	@ApiField("extend_param")
	private String extendParam;

	/**
	 * IFAA协议的版本，目前为2.0
	 */
	@ApiField("ifaa_version")
	private String ifaaVersion;

	/**
	 * ifaf_message:校验阶段客户端返回的协议体数据，对应《IFAA本地免密技术规范》中的IFAFMessage，内容中包含客户端的校验数据。
	 */
	@ApiField("ifaf_message")
	private String ifafMessage;

	/**
	 * 外部业务号，商户的业务单据号，用于核对与问题排查,原则上来说需要保持这个参数的唯一性。
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * IFAA协议客户端静态信息，调用IFAA客户端SDK接口获取secData，透传至本参数。此参数是为了兼容IFAA1.0而设计的，接入方可根据是否需要接入IFAA1.0来决定是否要传(只接入IFAA2.0不需要传)
	 */
	@ApiField("sec_data")
	private String secData;

	public String getExtendParam() {
		return this.extendParam;
	}
	public void setExtendParam(String extendParam) {
		this.extendParam = extendParam;
	}

	public String getIfaaVersion() {
		return this.ifaaVersion;
	}
	public void setIfaaVersion(String ifaaVersion) {
		this.ifaaVersion = ifaaVersion;
	}

	public String getIfafMessage() {
		return this.ifafMessage;
	}
	public void setIfafMessage(String ifafMessage) {
		this.ifafMessage = ifafMessage;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getSecData() {
		return this.secData;
	}
	public void setSecData(String secData) {
		this.secData = secData;
	}

}
