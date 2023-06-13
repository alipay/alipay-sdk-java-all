package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 批量应收确认请求
 *
 * @author auto create
 * @since 1.0, 2020-03-26 17:43:36
 */
public class ReceivableConfirmOrder extends AlipayObject {

	private static final long serialVersionUID = 5213934913427658975L;

	/**
	 * 合约号
	 */
	@ApiField("ar_no")
	private String arNo;

	/**
	 * 合约体系来源
	 */
	@ApiField("ar_source")
	private String arSource;

	/**
	 * 确认周期开始时间
	 */
	@ApiField("begin_date")
	private Date beginDate;

	/**
	 * 二级业务识别信息
	 */
	@ApiField("business_recognize_ext")
	private MapParameter businessRecognizeExt;

	/**
	 * 周期确认扩展计算因子
	 */
	@ApiField("calc_factor")
	private String calcFactor;

	/**
	 * 周期确认应收计算方法
	 */
	@ApiField("calc_method")
	private String calcMethod;

	/**
	 * 确认应收周期
	 */
	@ApiField("calc_period")
	private String calcPeriod;

	/**
	 * 应收确认模式，支持一次性和周期性确认
	 */
	@ApiField("confirm_model")
	private String confirmModel;

	/**
	 * 周期确认结束时间
	 */
	@ApiField("end_date")
	private Date endDate;

	/**
	 * 扩展信息
	 */
	@ApiListField("ext_info")
	@ApiField("map_parameter")
	private List<MapParameter> extInfo;

	/**
	 * 业务完成时间
	 */
	@ApiField("gmt_service")
	private Date gmtService;

	/**
	 * 核算主体代码
	 */
	@ApiField("inst_id")
	private String instId;

	/**
	 * 核算主体ID
	 */
	@ApiField("ip_id")
	private String ipId;

	/**
	 * 商户角色ID，即PID
	 */
	@ApiField("ip_role_id")
	private String ipRoleId;

	/**
	 * 业务请求号，用于幂等校验
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 业务产品码
	 */
	@ApiField("pd_code")
	private String pdCode;

	/**
	 * 产品事件码
	 */
	@ApiField("pd_event_code")
	private String pdEventCode;

	/**
	 * 产品体系来源
	 */
	@ApiField("pd_source")
	private String pdSource;

	/**
	 * 应收金额
	 */
	@ApiField("receivable_amount")
	private MultiCurrencyMoneyOpenApi receivableAmount;

	/**
	 * 应收单类型，支持普通和调整两类
	 */
	@ApiField("receivable_type")
	private String receivableType;

	/**
	 * 调用方系统名
	 */
	@ApiField("source")
	private String source;

	/**
	 * 用户体系来源
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

	public Date getBeginDate() {
		return this.beginDate;
	}
	public void setBeginDate(Date beginDate) {
		this.beginDate = beginDate;
	}

	public MapParameter getBusinessRecognizeExt() {
		return this.businessRecognizeExt;
	}
	public void setBusinessRecognizeExt(MapParameter businessRecognizeExt) {
		this.businessRecognizeExt = businessRecognizeExt;
	}

	public String getCalcFactor() {
		return this.calcFactor;
	}
	public void setCalcFactor(String calcFactor) {
		this.calcFactor = calcFactor;
	}

	public String getCalcMethod() {
		return this.calcMethod;
	}
	public void setCalcMethod(String calcMethod) {
		this.calcMethod = calcMethod;
	}

	public String getCalcPeriod() {
		return this.calcPeriod;
	}
	public void setCalcPeriod(String calcPeriod) {
		this.calcPeriod = calcPeriod;
	}

	public String getConfirmModel() {
		return this.confirmModel;
	}
	public void setConfirmModel(String confirmModel) {
		this.confirmModel = confirmModel;
	}

	public Date getEndDate() {
		return this.endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public List<MapParameter> getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(List<MapParameter> extInfo) {
		this.extInfo = extInfo;
	}

	public Date getGmtService() {
		return this.gmtService;
	}
	public void setGmtService(Date gmtService) {
		this.gmtService = gmtService;
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

	public String getPdEventCode() {
		return this.pdEventCode;
	}
	public void setPdEventCode(String pdEventCode) {
		this.pdEventCode = pdEventCode;
	}

	public String getPdSource() {
		return this.pdSource;
	}
	public void setPdSource(String pdSource) {
		this.pdSource = pdSource;
	}

	public MultiCurrencyMoneyOpenApi getReceivableAmount() {
		return this.receivableAmount;
	}
	public void setReceivableAmount(MultiCurrencyMoneyOpenApi receivableAmount) {
		this.receivableAmount = receivableAmount;
	}

	public String getReceivableType() {
		return this.receivableType;
	}
	public void setReceivableType(String receivableType) {
		this.receivableType = receivableType;
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
