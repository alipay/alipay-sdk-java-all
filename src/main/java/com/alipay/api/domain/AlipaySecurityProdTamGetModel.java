package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 供华为调用以获取TA的API
 *
 * @author auto create
 * @since 1.0, 2022-07-18 14:38:41
 */
public class AlipaySecurityProdTamGetModel extends AlipayObject {

	private static final long serialVersionUID = 1894966592953497662L;

	/**
	 * business_id业务流水号+唯一+用于和OEM厂商服务端唯一确定一笔业务，OEM厂商服务端请求TA数据时的请求需要带上这个id+由支付宝项目ifaatam生成发给OEM厂商服务端，OEM厂商服务端在后续请求中带上+64位的唯一值
	 */
	@ApiField("business_id")
	private String businessId;

	/**
	 * condition客户端状态信息，记录如会话id等信息的字段+不唯一+由客户端上传给支付宝，支付宝服务端，再转发给OEM厂商服务端，OEM厂商服务端请求ta的时候带上这个字段信息+特殊说明：为业务未来发展预留的字段，内容可能有较大变动
	 */
	@ApiField("condition")
	private String condition;

	/**
	 * ext_info+不唯一+JSON形式的map，包含关于ta摘要算法等信息+枚举值：BASE64_OVER_SHA256；BASE64_OVER_SHA512;BASE64_OVER_SM3+OEM厂商获取TA时放在入参里+缺省值为BASE64_OVER_SHA256
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * sp_aik_pub(OEM厂商服务端分配给服务商的公钥)+唯一+由OEM厂商服务端生成，OEM厂商服务端在请求ta文件时会带上这个公钥，用于支付宝加密对称密钥返回给OEM厂商服务端+示例值由于输入长度限制并非真实的公钥长度
	 */
	@ApiField("sp_aik_pub")
	private String spAikPub;

	/**
	 * sp_id（service provider id）+唯一+由OEM厂商服务端分配给各个服务商（如支付宝），每个服务商有个固定的id+由OEM厂商服务端分配
	 */
	@ApiField("sp_id")
	private String spId;

	/**
	 * ta_id(trusted application id，可信应用id)+不唯一+由客户端上传给支付宝服务端用于支付宝服务端确定下发的ta文件类型，传递给OEM厂商服务端tam，OEM厂商服务端请求ta文件会带上这个ta_id+生成方式由支付宝确定
	 */
	@ApiField("ta_id")
	private String taId;

	/**
	 * ta_version（可信应用版本号）+不唯一+由客户端上传给支付宝服务端用于确认ta的版本信息，传递给OEM厂商服务端，OEM厂商服务端请求ta文件会带上这个版本信息ta_version+生成方式由支付宝确定
	 */
	@ApiField("ta_version")
	private String taVersion;

	public String getBusinessId() {
		return this.businessId;
	}
	public void setBusinessId(String businessId) {
		this.businessId = businessId;
	}

	public String getCondition() {
		return this.condition;
	}
	public void setCondition(String condition) {
		this.condition = condition;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getSpAikPub() {
		return this.spAikPub;
	}
	public void setSpAikPub(String spAikPub) {
		this.spAikPub = spAikPub;
	}

	public String getSpId() {
		return this.spId;
	}
	public void setSpId(String spId) {
		this.spId = spId;
	}

	public String getTaId() {
		return this.taId;
	}
	public void setTaId(String taId) {
		this.taId = taId;
	}

	public String getTaVersion() {
		return this.taVersion;
	}
	public void setTaVersion(String taVersion) {
		this.taVersion = taVersion;
	}

}
