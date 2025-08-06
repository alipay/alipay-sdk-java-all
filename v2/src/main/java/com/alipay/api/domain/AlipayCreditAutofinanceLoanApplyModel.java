package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 提交贷款订单
 *
 * @author auto create
 * @since 1.0, 2017-11-23 15:49:56
 */
public class AlipayCreditAutofinanceLoanApplyModel extends AlipayObject {

	private static final long serialVersionUID = 2497864592548213863L;

	/**
	 * 区域
	 */
	@ApiField("area")
	private String area;

	/**
	 * 征信结果回调地址
	 */
	@ApiField("backurl")
	private String backurl;

	/**
	 * 扩展参数信息，json格式，针对不同的业务平台有不同的参数，目前大搜车业务支持的参数有：firstpayamt 首付租金，firstpayprop 首付比例，lastpayamt 回购尾款，loantenor 贷款期数，monthpayamt 每月还款额度
	 */
	@ApiField("extparam")
	private String extparam;

	/**
	 * 外部平台宝贝ID
	 */
	@ApiField("itemid")
	private String itemid;

	/**
	 * 机构编码
	 */
	@ApiField("orgcode")
	private String orgcode;

	/**
	 * 外部平台订单号,64个字符以内、只能包含字母、数字、下划线；需保证在外部平台端不重复
	 */
	@ApiField("outorderno")
	private String outorderno;

	/**
	 * 支付宝账号数字ID
	 */
	@ApiField("uid")
	private String uid;

	/**
	 * 核身VID
	 */
	@ApiField("verifyid")
	private String verifyid;

	/**
	 * 当前安装的支付宝钱包版本号
	 */
	@ApiField("version")
	private String version;

	public String getArea() {
		return this.area;
	}
	public void setArea(String area) {
		this.area = area;
	}

	public String getBackurl() {
		return this.backurl;
	}
	public void setBackurl(String backurl) {
		this.backurl = backurl;
	}

	public String getExtparam() {
		return this.extparam;
	}
	public void setExtparam(String extparam) {
		this.extparam = extparam;
	}

	public String getItemid() {
		return this.itemid;
	}
	public void setItemid(String itemid) {
		this.itemid = itemid;
	}

	public String getOrgcode() {
		return this.orgcode;
	}
	public void setOrgcode(String orgcode) {
		this.orgcode = orgcode;
	}

	public String getOutorderno() {
		return this.outorderno;
	}
	public void setOutorderno(String outorderno) {
		this.outorderno = outorderno;
	}

	public String getUid() {
		return this.uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getVerifyid() {
		return this.verifyid;
	}
	public void setVerifyid(String verifyid) {
		this.verifyid = verifyid;
	}

	public String getVersion() {
		return this.version;
	}
	public void setVersion(String version) {
		this.version = version;
	}

}
