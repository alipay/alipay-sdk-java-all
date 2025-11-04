package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 用于同步合同相关变更信息
 *
 * @author auto create
 * @since 1.0, 2025-09-22 13:37:56
 */
public class ContractChangeSyncRequest extends AlipayObject {

	private static final long serialVersionUID = 1216795367225464521L;

	/**
	 * 文件信息
	 */
	@ApiField("attachment_file_info")
	private AttachmentFileInfo attachmentFileInfo;

	/**
	 * 用于定义具体的业务场景，由财务结算进行统一定义与分配，使用前需咨询财务结算获取对应业务场景定义，例如合同一致性业务场景填：CONTRACT_CONSISTENCY
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * * 变更类型，上游根据实际变更场景填写，例如上游如果是新增合同可尝试填写ADD
	 */
	@ApiField("change_type")
	private String changeType;

	/**
	 * 使用方的合同号，使用方如实填写即可，无需咨询财务结算
	 */
	@ApiField("contract_id")
	private String contractId;

	/**
	 * 合同文件的全名，需要包含后缀名
	 */
	@ApiField("contract_name")
	private String contractName;

	/**
	 * 用于定义合同所属源头，由财务结算统一动态生成并发挥，使用前需咨询财务结算获取对应业务的合同源，例如置业合同源可填写为PROPERTY_ZHIYE
	 */
	@ApiField("contract_source")
	private String contractSource;

	/**
	 * 描述当前业务方所属业务域，大多数情况下需要使用财务结算分配的核心层业务身份，例如：置业：BID215008008077000
	 */
	@ApiField("domain")
	private String domain;

	/**
	 * 元数据描述
	 */
	@ApiListField("meta_datas")
	@ApiField("meta_data")
	private List<MetaData> metaDatas;

	/**
	 * 同步合同的模式，上游实际场景填写即可
	 */
	@ApiField("sync_mode")
	private String syncMode;

	/**
	 * 用于定义是哪个系统发送的请求，使用方如实填写即可，无需咨询财务结算
	 */
	@ApiField("sys_source")
	private String sysSource;

	public AttachmentFileInfo getAttachmentFileInfo() {
		return this.attachmentFileInfo;
	}
	public void setAttachmentFileInfo(AttachmentFileInfo attachmentFileInfo) {
		this.attachmentFileInfo = attachmentFileInfo;
	}

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public String getChangeType() {
		return this.changeType;
	}
	public void setChangeType(String changeType) {
		this.changeType = changeType;
	}

	public String getContractId() {
		return this.contractId;
	}
	public void setContractId(String contractId) {
		this.contractId = contractId;
	}

	public String getContractName() {
		return this.contractName;
	}
	public void setContractName(String contractName) {
		this.contractName = contractName;
	}

	public String getContractSource() {
		return this.contractSource;
	}
	public void setContractSource(String contractSource) {
		this.contractSource = contractSource;
	}

	public String getDomain() {
		return this.domain;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}

	public List<MetaData> getMetaDatas() {
		return this.metaDatas;
	}
	public void setMetaDatas(List<MetaData> metaDatas) {
		this.metaDatas = metaDatas;
	}

	public String getSyncMode() {
		return this.syncMode;
	}
	public void setSyncMode(String syncMode) {
		this.syncMode = syncMode;
	}

	public String getSysSource() {
		return this.sysSource;
	}
	public void setSysSource(String sysSource) {
		this.sysSource = sysSource;
	}

}
