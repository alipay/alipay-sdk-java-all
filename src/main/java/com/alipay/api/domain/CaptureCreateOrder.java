package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 请款创建单
 *
 * @author auto create
 * @since 1.0, 2020-03-26 17:40:40
 */
public class CaptureCreateOrder extends AlipayObject {

	private static final long serialVersionUID = 2437933915911633587L;

	/**
	 * 合约号
	 */
	@ApiField("ar_no")
	private String arNo;

	/**
	 * 合约体系： IARCORE - ipay合约中心 MYBKARCORE - 网商产品中心 ARCORE - 主站合约 中心 OTHER - 其他合约中心
	 */
	@ApiField("ar_source")
	private String arSource;

	/**
	 * 业务扩展类型 当前大量的业务系统采取复用产品码的方案，需要额外的业务识别才能够明确业务
	 */
	@ApiField("business_recognize_ext")
	private MapParameter businessRecognizeExt;

	/**
	 * 请款金额
	 */
	@ApiField("capture_amount")
	private MultiCurrencyMoneyOpenApi captureAmount;

	/**
	 * 请款时间（yyyymmdd）
	 */
	@ApiField("capture_date")
	private String captureDate;

	/**
	 * 扩展信息
	 */
	@ApiListField("ext_info")
	@ApiField("map_parameter")
	private List<MapParameter> extInfo;

	/**
	 * 核算所属机构
	 */
	@ApiField("inst_id")
	private String instId;

	/**
	 * 请款MID
	 */
	@ApiField("ip_id")
	private String ipId;

	/**
	 * 请款PID
	 */
	@ApiField("ip_role_id")
	private String ipRoleId;

	/**
	 * 外部业务请求号，用于幂等控制
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 端产品码
	 */
	@ApiField("pd_code")
	private String pdCode;

	/**
	 * 产品体系： IPTCORE -ipay产品中心 MYBKPTCORE - 网商产品中心 PTCORE - 主站产品中心 AFC - 金融云产品中心
	 */
	@ApiField("pd_source")
	private String pdSource;

	/**
	 * 调用方系统名称
	 */
	@ApiField("source")
	private String source;

	/**
	 * 用户体系： ICIF - ipay用户体系 MYBKCIF - 网商银行用户体系 CIF - 主站用户体系 UC - 金融云用户体系
	 */
	@ApiField("user_source")
	private String userSource;

	public String getArNo() {
		return this.arNo;
	}
	public void setArNo(String arNo) {
		this.arNo = arNo;
	}

	public String getArSource() {
		return this.arSource;
	}
	public void setArSource(String arSource) {
		this.arSource = arSource;
	}

	public MapParameter getBusinessRecognizeExt() {
		return this.businessRecognizeExt;
	}
	public void setBusinessRecognizeExt(MapParameter businessRecognizeExt) {
		this.businessRecognizeExt = businessRecognizeExt;
	}

	public MultiCurrencyMoneyOpenApi getCaptureAmount() {
		return this.captureAmount;
	}
	public void setCaptureAmount(MultiCurrencyMoneyOpenApi captureAmount) {
		this.captureAmount = captureAmount;
	}

	public String getCaptureDate() {
		return this.captureDate;
	}
	public void setCaptureDate(String captureDate) {
		this.captureDate = captureDate;
	}

	public List<MapParameter> getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(List<MapParameter> extInfo) {
		this.extInfo = extInfo;
	}

	public String getInstId() {
		return this.instId;
	}
	public void setInstId(String instId) {
		this.instId = instId;
	}

	public String getIpId() {
		return this.ipId;
	}
	public void setIpId(String ipId) {
		this.ipId = ipId;
	}

	public String getIpRoleId() {
		return this.ipRoleId;
	}
	public void setIpRoleId(String ipRoleId) {
		this.ipRoleId = ipRoleId;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getPdCode() {
		return this.pdCode;
	}
	public void setPdCode(String pdCode) {
		this.pdCode = pdCode;
	}

	public String getPdSource() {
		return this.pdSource;
	}
	public void setPdSource(String pdSource) {
		this.pdSource = pdSource;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

	public String getUserSource() {
		return this.userSource;
	}
	public void setUserSource(String userSource) {
		this.userSource = userSource;
	}

}
