package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 资金管控任务创建
 *
 * @author auto create
 * @since 1.0, 2024-10-31 10:11:09
 */
public class AnttechBlockchainFinanceFsupvTaskCreateModel extends AlipayObject {

	private static final long serialVersionUID = 5754349329511144859L;

	/**
	 * 资金管控任务产品码，可联系产品或运营同学获取
	 */
	@ApiField("fund_supv_product_code")
	private String fundSupvProductCode;

	/**
	 * 交易标的编号，按照实际交易对象编号填写。如网约车场景下为该四轮车车架号
	 */
	@ApiField("obj_number")
	private String objNumber;

	/**
	 * 标的交易结束时间
	 */
	@ApiField("obj_trade_end")
	private Date objTradeEnd;

	/**
	 * 标的交易分期金额，单位为元；在租赁交易下为每期的租金
	 */
	@ApiField("obj_trade_install_amount")
	private String objTradeInstallAmount;

	/**
	 * 标的交易编号，根据实际标的交易时的交易编号填写
	 */
	@ApiField("obj_trade_no")
	private String objTradeNo;

	/**
	 * 标的交易结算周期类型，在租赁交易下为租金结算周期
	 */
	@ApiField("obj_trade_settle_period_type")
	private String objTradeSettlePeriodType;

	/**
	 * 标的交易起始时间
	 */
	@ApiField("obj_trade_start")
	private Date objTradeStart;

	/**
	 * 标的交易类型，根据实际标的交易时的交易类型填写
	 */
	@ApiField("obj_trade_type")
	private String objTradeType;

	/**
	 * 交易标的类型，按照实际交易时标的类型填写
	 */
	@ApiField("obj_type")
	private String objType;

	/**
	 * 交易请求号，以yyyyMMdd时间串格式开始，在调用方系统内需要保持全局唯一，是判断幂等逻辑请求唯一识别码。
	 */
	@ApiField("request_no")
	private String requestNo;

	/**
	 * 被管控方证件号码，按实际场景获取
	 */
	@ApiField("supervised_id_number")
	private String supervisedIdNumber;

	/**
	 * 被管控方证件类型，按照枚举中的实际值进行填写
	 */
	@ApiField("supervised_id_type")
	private String supervisedIdType;

	/**
	 * 被管控方名称，按照被管控方实际名称获取
	 */
	@ApiField("supervised_name")
	private String supervisedName;

	/**
	 * 管控方证件号码
	 */
	@ApiField("supervisor_id_number")
	private String supervisorIdNumber;

	/**
	 * 管控方证件类型，根据实际场景按照枚举值中的类型进行填写
	 */
	@ApiField("supervisor_id_type")
	private String supervisorIdType;

	/**
	 * 管控方名称，按实际场景中管控方名称填写
	 */
	@ApiField("supervisor_name")
	private String supervisorName;

	public String getFundSupvProductCode() {
		return this.fundSupvProductCode;
	}
	public void setFundSupvProductCode(String fundSupvProductCode) {
		this.fundSupvProductCode = fundSupvProductCode;
	}

	public String getObjNumber() {
		return this.objNumber;
	}
	public void setObjNumber(String objNumber) {
		this.objNumber = objNumber;
	}

	public Date getObjTradeEnd() {
		return this.objTradeEnd;
	}
	public void setObjTradeEnd(Date objTradeEnd) {
		this.objTradeEnd = objTradeEnd;
	}

	public String getObjTradeInstallAmount() {
		return this.objTradeInstallAmount;
	}
	public void setObjTradeInstallAmount(String objTradeInstallAmount) {
		this.objTradeInstallAmount = objTradeInstallAmount;
	}

	public String getObjTradeNo() {
		return this.objTradeNo;
	}
	public void setObjTradeNo(String objTradeNo) {
		this.objTradeNo = objTradeNo;
	}

	public String getObjTradeSettlePeriodType() {
		return this.objTradeSettlePeriodType;
	}
	public void setObjTradeSettlePeriodType(String objTradeSettlePeriodType) {
		this.objTradeSettlePeriodType = objTradeSettlePeriodType;
	}

	public Date getObjTradeStart() {
		return this.objTradeStart;
	}
	public void setObjTradeStart(Date objTradeStart) {
		this.objTradeStart = objTradeStart;
	}

	public String getObjTradeType() {
		return this.objTradeType;
	}
	public void setObjTradeType(String objTradeType) {
		this.objTradeType = objTradeType;
	}

	public String getObjType() {
		return this.objType;
	}
	public void setObjType(String objType) {
		this.objType = objType;
	}

	public String getRequestNo() {
		return this.requestNo;
	}
	public void setRequestNo(String requestNo) {
		this.requestNo = requestNo;
	}

	public String getSupervisedIdNumber() {
		return this.supervisedIdNumber;
	}
	public void setSupervisedIdNumber(String supervisedIdNumber) {
		this.supervisedIdNumber = supervisedIdNumber;
	}

	public String getSupervisedIdType() {
		return this.supervisedIdType;
	}
	public void setSupervisedIdType(String supervisedIdType) {
		this.supervisedIdType = supervisedIdType;
	}

	public String getSupervisedName() {
		return this.supervisedName;
	}
	public void setSupervisedName(String supervisedName) {
		this.supervisedName = supervisedName;
	}

	public String getSupervisorIdNumber() {
		return this.supervisorIdNumber;
	}
	public void setSupervisorIdNumber(String supervisorIdNumber) {
		this.supervisorIdNumber = supervisorIdNumber;
	}

	public String getSupervisorIdType() {
		return this.supervisorIdType;
	}
	public void setSupervisorIdType(String supervisorIdType) {
		this.supervisorIdType = supervisorIdType;
	}

	public String getSupervisorName() {
		return this.supervisorName;
	}
	public void setSupervisorName(String supervisorName) {
		this.supervisorName = supervisorName;
	}

}
