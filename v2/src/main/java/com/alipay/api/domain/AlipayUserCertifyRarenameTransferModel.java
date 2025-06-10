package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 姓名生僻字指定目标编码转码
 *
 * @author auto create
 * @since 1.0, 2023-08-23 14:20:26
 */
public class AlipayUserCertifyRarenameTransferModel extends AlipayObject {

	private static final long serialVersionUID = 4639871795857273122L;

	/**
	 * 姓名
	 */
	@ApiField("name")
	private String name;

	/**
	 * 主体id，打日志用于方便排查问题用，可传业务id，没业务id的可传一个随机生成的uuid。
	 */
	@ApiField("principal_id")
	private String principalId;

	/**
	 * 用于标识这笔请求的业务场景，业务可以根据实际场景自己定义取值，比如支付宝认证"alipay_certify"。
	 */
	@ApiField("scene")
	private String scene;

	/**
	 * 期望编码，取值: PUA(人口信息PUA编码), UNICODE(UNICODE统一编码), PINYIN(拼音方式), SPLIT(拆字方式), TRADITIONAL(繁简异体码)。
	 */
	@ApiField("target_encode_type")
	private String targetEncodeType;

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getPrincipalId() {
		return this.principalId;
	}
	public void setPrincipalId(String principalId) {
		this.principalId = principalId;
	}

	public String getScene() {
		return this.scene;
	}
	public void setScene(String scene) {
		this.scene = scene;
	}

	public String getTargetEncodeType() {
		return this.targetEncodeType;
	}
	public void setTargetEncodeType(String targetEncodeType) {
		this.targetEncodeType = targetEncodeType;
	}

}
