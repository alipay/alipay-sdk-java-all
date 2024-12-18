package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 可信价值中心实体创建
 *
 * @author auto create
 * @since 1.0, 2024-07-19 15:27:47
 */
public class AnttechBlockchainFinanceEnergyEntityCreateModel extends AlipayObject {

	private static final long serialVersionUID = 1453642644832547236L;

	/**
	 * 联系人
	 */
	@ApiField("contact_name")
	private String contactName;

	/**
	 * 联系电话
	 */
	@ApiField("contact_number")
	private String contactNumber;

	/**
	 * 设备信息
	 */
	@ApiField("device_info")
	private TrustDeviceInfo deviceInfo;

	/**
	 * 实体地址
	 */
	@ApiField("entity_address")
	private EntityAddress entityAddress;

	/**
	 * 实体名称，如站点名称、户名等
	 */
	@ApiField("entity_name")
	private String entityName;

	/**
	 * 实体类型，如站点、能源系统、终端设备
	 */
	@ApiField("entity_type")
	private String entityType;

	/**
	 * 实体相关的业务时间，如站点投产日期等
	 */
	@ApiField("operate_date")
	private Date operateDate;

	/**
	 * 实体运营企业
	 */
	@ApiField("operator_enterprise")
	private EntityEnterpriseInfo operatorEnterprise;

	/**
	 * 商户系统中，对应的实体编号。
如户号、站点ID、虚拟电厂ID等
	 */
	@ApiField("out_entity_id")
	private String outEntityId;

	/**
	 * 实体归属企业信息
	 */
	@ApiField("owner_enterprise")
	private EntityEnterpriseInfo ownerEnterprise;

	/**
	 * 父级实体的Id，当商户创建的实体之间存在关联关系时，必须先创建父级实体，再创建子实体。
子实体创建时，父级实体不能为空。不然无法创建实体建关系。
	 */
	@ApiField("parent_out_entity_id")
	private String parentOutEntityId;

	/**
	 * 可信价值服务中心产品的合约码，由蚂蚁业务同学完成签约后给到商户
	 */
	@ApiField("product_agreement_code")
	private String productAgreementCode;

	/**
	 * 站点信息
	 */
	@ApiField("station_info")
	private TrustStationInfo stationInfo;

	/**
	 * 能源系统信息
	 */
	@ApiField("system_info")
	private TrustSystemInfo systemInfo;

	public String getContactName() {
		return this.contactName;
	}
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public String getContactNumber() {
		return this.contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public TrustDeviceInfo getDeviceInfo() {
		return this.deviceInfo;
	}
	public void setDeviceInfo(TrustDeviceInfo deviceInfo) {
		this.deviceInfo = deviceInfo;
	}

	public EntityAddress getEntityAddress() {
		return this.entityAddress;
	}
	public void setEntityAddress(EntityAddress entityAddress) {
		this.entityAddress = entityAddress;
	}

	public String getEntityName() {
		return this.entityName;
	}
	public void setEntityName(String entityName) {
		this.entityName = entityName;
	}

	public String getEntityType() {
		return this.entityType;
	}
	public void setEntityType(String entityType) {
		this.entityType = entityType;
	}

	public Date getOperateDate() {
		return this.operateDate;
	}
	public void setOperateDate(Date operateDate) {
		this.operateDate = operateDate;
	}

	public EntityEnterpriseInfo getOperatorEnterprise() {
		return this.operatorEnterprise;
	}
	public void setOperatorEnterprise(EntityEnterpriseInfo operatorEnterprise) {
		this.operatorEnterprise = operatorEnterprise;
	}

	public String getOutEntityId() {
		return this.outEntityId;
	}
	public void setOutEntityId(String outEntityId) {
		this.outEntityId = outEntityId;
	}

	public EntityEnterpriseInfo getOwnerEnterprise() {
		return this.ownerEnterprise;
	}
	public void setOwnerEnterprise(EntityEnterpriseInfo ownerEnterprise) {
		this.ownerEnterprise = ownerEnterprise;
	}

	public String getParentOutEntityId() {
		return this.parentOutEntityId;
	}
	public void setParentOutEntityId(String parentOutEntityId) {
		this.parentOutEntityId = parentOutEntityId;
	}

	public String getProductAgreementCode() {
		return this.productAgreementCode;
	}
	public void setProductAgreementCode(String productAgreementCode) {
		this.productAgreementCode = productAgreementCode;
	}

	public TrustStationInfo getStationInfo() {
		return this.stationInfo;
	}
	public void setStationInfo(TrustStationInfo stationInfo) {
		this.stationInfo = stationInfo;
	}

	public TrustSystemInfo getSystemInfo() {
		return this.systemInfo;
	}
	public void setSystemInfo(TrustSystemInfo systemInfo) {
		this.systemInfo = systemInfo;
	}

}
