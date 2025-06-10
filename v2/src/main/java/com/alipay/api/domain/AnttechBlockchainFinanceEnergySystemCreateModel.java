package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 能源系统创建
 *
 * @author auto create
 * @since 1.0, 2024-09-02 21:57:16
 */
public class AnttechBlockchainFinanceEnergySystemCreateModel extends AlipayObject {

	private static final long serialVersionUID = 6668352997876342371L;

	/**
	 * 是否可调节
	 */
	@ApiField("adjustable")
	private Boolean adjustable;

	/**
	 * 能源系统投产日期
	 */
	@ApiField("operate_date")
	private Date operateDate;

	/**
	 * 归属主体
	 */
	@ApiField("owner_entity")
	private TrustEntityInfo ownerEntity;

	/**
	 * 可信价值服务中心产品的合约码，由蚂蚁业务同学完成签约后给到商户
	 */
	@ApiField("product_agreement_code")
	private String productAgreementCode;

	/**
	 * 总额定功率，单位KW
	 */
	@ApiField("rated_power_sum")
	private String ratedPowerSum;

	/**
	 * 响应级别
	 */
	@ApiField("response_level")
	private String responseLevel;

	/**
	 * 场站编码
	 */
	@ApiField("station_id")
	private String stationId;

	/**
	 * 能源系统编号
	 */
	@ApiField("system_id")
	private String systemId;

	/**
	 * 系统的专属信息。
	 */
	@ApiField("system_info")
	private String systemInfo;

	/**
	 * 系统名称
	 */
	@ApiField("system_name")
	private String systemName;

	/**
	 * 系统状态
	 */
	@ApiField("system_status")
	private String systemStatus;

	/**
	 * 系统类型
	 */
	@ApiField("system_type")
	private String systemType;

	public Boolean getAdjustable() {
		return this.adjustable;
	}
	public void setAdjustable(Boolean adjustable) {
		this.adjustable = adjustable;
	}

	public Date getOperateDate() {
		return this.operateDate;
	}
	public void setOperateDate(Date operateDate) {
		this.operateDate = operateDate;
	}

	public TrustEntityInfo getOwnerEntity() {
		return this.ownerEntity;
	}
	public void setOwnerEntity(TrustEntityInfo ownerEntity) {
		this.ownerEntity = ownerEntity;
	}

	public String getProductAgreementCode() {
		return this.productAgreementCode;
	}
	public void setProductAgreementCode(String productAgreementCode) {
		this.productAgreementCode = productAgreementCode;
	}

	public String getRatedPowerSum() {
		return this.ratedPowerSum;
	}
	public void setRatedPowerSum(String ratedPowerSum) {
		this.ratedPowerSum = ratedPowerSum;
	}

	public String getResponseLevel() {
		return this.responseLevel;
	}
	public void setResponseLevel(String responseLevel) {
		this.responseLevel = responseLevel;
	}

	public String getStationId() {
		return this.stationId;
	}
	public void setStationId(String stationId) {
		this.stationId = stationId;
	}

	public String getSystemId() {
		return this.systemId;
	}
	public void setSystemId(String systemId) {
		this.systemId = systemId;
	}

	public String getSystemInfo() {
		return this.systemInfo;
	}
	public void setSystemInfo(String systemInfo) {
		this.systemInfo = systemInfo;
	}

	public String getSystemName() {
		return this.systemName;
	}
	public void setSystemName(String systemName) {
		this.systemName = systemName;
	}

	public String getSystemStatus() {
		return this.systemStatus;
	}
	public void setSystemStatus(String systemStatus) {
		this.systemStatus = systemStatus;
	}

	public String getSystemType() {
		return this.systemType;
	}
	public void setSystemType(String systemType) {
		this.systemType = systemType;
	}

}
