package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * TPA渠道开通白名单同步
 *
 * @author auto create
 * @since 1.0, 2025-12-26 19:52:42
 */
public class AlipayCommerceMedicalInsuranceTpawhiteuserSyncModel extends AlipayObject {

	private static final long serialVersionUID = 1862444549425669213L;

	/**
	 * 支付宝给出固定值，见文档
	 */
	@ApiField("data_encryption_type")
	private String dataEncryptionType;

	/**
	 * 主体id
	 */
	@ApiField("entity_id")
	private String entityId;

	/**
	 * 支付宝给出固定值，见文档
	 */
	@ApiField("entity_type")
	private String entityType;

	/**
	 * 扩展信息，业务交互需要
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * null
	 */
	@ApiListField("insured_list")
	@ApiField("insured_info")
	private List<InsuredInfo> insuredList;

	/**
	 * 支付宝给出固定值，见文档
	 */
	@ApiField("source")
	private String source;

	public String getDataEncryptionType() {
		return this.dataEncryptionType;
	}
	public void setDataEncryptionType(String dataEncryptionType) {
		this.dataEncryptionType = dataEncryptionType;
	}

	public String getEntityId() {
		return this.entityId;
	}
	public void setEntityId(String entityId) {
		this.entityId = entityId;
	}

	public String getEntityType() {
		return this.entityType;
	}
	public void setEntityType(String entityType) {
		this.entityType = entityType;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public List<InsuredInfo> getInsuredList() {
		return this.insuredList;
	}
	public void setInsuredList(List<InsuredInfo> insuredList) {
		this.insuredList = insuredList;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

}
