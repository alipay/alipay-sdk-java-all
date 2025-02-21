package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 合约基本信息
 *
 * @author auto create
 * @since 1.0, 2016-09-09 20:38:43
 */
public class ArrangementBaseVO extends AlipayObject {

	private static final long serialVersionUID = 6493944846711789711L;

	/**
	 * 应用id
	 */
	@ApiField("app_id")
	private String appId;

	/**
	 * 签约机构编码
	 */
	@ApiField("arrangement_institution_code")
	private String arrangementInstitutionCode;

	/**
	 * 合约名称
	 */
	@ApiField("arrangement_name")
	private String arrangementName;

	/**
	 * 合约编号
	 */
	@ApiField("arrangement_no")
	private String arrangementNo;

	/**
	 * 合约类型
	 */
	@ApiField("arrangement_type")
	private String arrangementType;

	/**
	 * 合约版
	 */
	@ApiField("arrangement_version")
	private String arrangementVersion;

	/**
	 * 签约渠道来源
	 */
	@ApiField("channel_code")
	private String channelCode;

	/**
	 * 合约失效时间
	 */
	@ApiField("gmt_end")
	private String gmtEnd;

	/**
	 * 到期时间
	 */
	@ApiField("gmt_expired")
	private Date gmtExpired;

	/**
	 * 预计合约失效时间
	 */
	@ApiField("gmt_invalid_due")
	private String gmtInvalidDue;

	/**
	 * 合约签署时间
	 */
	@ApiField("gmt_sign")
	private Date gmtSign;

	/**
	 * 预计合约生效时间
	 */
	@ApiField("gmt_vald_due")
	private String gmtValdDue;

	/**
	 * 合约版本时间
	 */
	@ApiField("gmt_vrsn")
	private Date gmtVrsn;

	/**
	 * 参与者角色ID
	 */
	@ApiField("ip_role_id")
	private String ipRoleId;

	/**
	 * 修改人
	 */
	@ApiField("last_moder")
	private String lastModer;

	/**
	 * 外标类型
	 */
	@ApiField("mark_type")
	private String markType;

	/**
	 * 备注
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 修改人类型
	 */
	@ApiField("moder_type")
	private String moderType;

	/**
	 * 签约产品外标
	 */
	@ApiField("pd_mark")
	private String pdMark;

	/**
	 * 产品编码
	 */
	@ApiField("prod_code")
	private String prodCode;

	/**
	 * 产品名称
	 */
	@ApiField("prod_name")
	private String prodName;

	/**
	 * 产品版本
	 */
	@ApiField("prod_version")
	private String prodVersion;

	/**
	 * ps(产品销售)编码
	 */
	@ApiField("ps_code")
	private String psCode;

	/**
	 * ps(产品销售)id
	 */
	@ApiField("ps_id")
	private String psId;

	/**
	 * 产品销售名称
	 */
	@ApiField("ps_name")
	private String psName;

	/**
	 * 合约状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 签约模板产品编码
	 */
	@ApiField("template_prod_code")
	private String templateProdCode;

	/**
	 * 签约模板产品版本
	 */
	@ApiField("template_prod_version")
	private String templateProdVersion;

	public String getAppId() {
		return this.appId;
	}
	public void setAppId(String appId) {
		this.appId = appId;
	}

	public String getArrangementInstitutionCode() {
		return this.arrangementInstitutionCode;
	}
	public void setArrangementInstitutionCode(String arrangementInstitutionCode) {
		this.arrangementInstitutionCode = arrangementInstitutionCode;
	}

	public String getArrangementName() {
		return this.arrangementName;
	}
	public void setArrangementName(String arrangementName) {
		this.arrangementName = arrangementName;
	}

	public String getArrangementNo() {
		return this.arrangementNo;
	}
	public void setArrangementNo(String arrangementNo) {
		this.arrangementNo = arrangementNo;
	}

	public String getArrangementType() {
		return this.arrangementType;
	}
	public void setArrangementType(String arrangementType) {
		this.arrangementType = arrangementType;
	}

	public String getArrangementVersion() {
		return this.arrangementVersion;
	}
	public void setArrangementVersion(String arrangementVersion) {
		this.arrangementVersion = arrangementVersion;
	}

	public String getChannelCode() {
		return this.channelCode;
	}
	public void setChannelCode(String channelCode) {
		this.channelCode = channelCode;
	}

	public String getGmtEnd() {
		return this.gmtEnd;
	}
	public void setGmtEnd(String gmtEnd) {
		this.gmtEnd = gmtEnd;
	}

	public Date getGmtExpired() {
		return this.gmtExpired;
	}
	public void setGmtExpired(Date gmtExpired) {
		this.gmtExpired = gmtExpired;
	}

	public String getGmtInvalidDue() {
		return this.gmtInvalidDue;
	}
	public void setGmtInvalidDue(String gmtInvalidDue) {
		this.gmtInvalidDue = gmtInvalidDue;
	}

	public Date getGmtSign() {
		return this.gmtSign;
	}
	public void setGmtSign(Date gmtSign) {
		this.gmtSign = gmtSign;
	}

	public String getGmtValdDue() {
		return this.gmtValdDue;
	}
	public void setGmtValdDue(String gmtValdDue) {
		this.gmtValdDue = gmtValdDue;
	}

	public Date getGmtVrsn() {
		return this.gmtVrsn;
	}
	public void setGmtVrsn(Date gmtVrsn) {
		this.gmtVrsn = gmtVrsn;
	}

	public String getIpRoleId() {
		return this.ipRoleId;
	}
	public void setIpRoleId(String ipRoleId) {
		this.ipRoleId = ipRoleId;
	}

	public String getLastModer() {
		return this.lastModer;
	}
	public void setLastModer(String lastModer) {
		this.lastModer = lastModer;
	}

	public String getMarkType() {
		return this.markType;
	}
	public void setMarkType(String markType) {
		this.markType = markType;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getModerType() {
		return this.moderType;
	}
	public void setModerType(String moderType) {
		this.moderType = moderType;
	}

	public String getPdMark() {
		return this.pdMark;
	}
	public void setPdMark(String pdMark) {
		this.pdMark = pdMark;
	}

	public String getProdCode() {
		return this.prodCode;
	}
	public void setProdCode(String prodCode) {
		this.prodCode = prodCode;
	}

	public String getProdName() {
		return this.prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public String getProdVersion() {
		return this.prodVersion;
	}
	public void setProdVersion(String prodVersion) {
		this.prodVersion = prodVersion;
	}

	public String getPsCode() {
		return this.psCode;
	}
	public void setPsCode(String psCode) {
		this.psCode = psCode;
	}

	public String getPsId() {
		return this.psId;
	}
	public void setPsId(String psId) {
		this.psId = psId;
	}

	public String getPsName() {
		return this.psName;
	}
	public void setPsName(String psName) {
		this.psName = psName;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getTemplateProdCode() {
		return this.templateProdCode;
	}
	public void setTemplateProdCode(String templateProdCode) {
		this.templateProdCode = templateProdCode;
	}

	public String getTemplateProdVersion() {
		return this.templateProdVersion;
	}
	public void setTemplateProdVersion(String templateProdVersion) {
		this.templateProdVersion = templateProdVersion;
	}

}
