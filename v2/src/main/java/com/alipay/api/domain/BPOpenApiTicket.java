package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 流程实例工单
 *
 * @author auto create
 * @since 1.0, 2022-10-19 20:13:27
 */
public class BPOpenApiTicket extends AlipayObject {

	private static final long serialVersionUID = 2474548317184876285L;

	/**
	 * 附件
	 */
	@ApiField("attachment")
	private String attachment;

	/**
	 * 来自于哪个系统
	 */
	@ApiField("biz_app")
	private String bizApp;

	/**
	 * 业务ID, 若来自fcprocess系统，则为pcs_process_instance_id
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 业务上下文
	 */
	@ApiField("business_context")
	private String businessContext;

	/**
	 * 变更版本号
	 */
	@ApiField("change_version")
	private Long changeVersion;

	/**
	 * 配置ID
	 */
	@ApiField("config_id")
	private String configId;

	/**
	 * 创建人用户域名
	 */
	@ApiField("create_operator")
	private String createOperator;

	/**
	 * 创建者名称
	 */
	@ApiField("create_operator_name")
	private String createOperatorName;

	/**
	 * 工单处理链接地址
	 */
	@ApiField("deal_url")
	private String dealUrl;

	/**
	 * 描述
	 */
	@ApiField("description")
	private String description;

	/**
	 * 工单内嵌详情地址
	 */
	@ApiField("detail_url")
	private String detailUrl;

	/**
	 * 配置显示名称
	 */
	@ApiField("display_name")
	private String displayName;

	/**
	 * 域ID
	 */
	@ApiField("domain_id")
	private String domainId;

	/**
	 * 完结时间间隔（毫秒）
	 */
	@ApiField("duration")
	private Long duration;

	/**
	 * 扩展信息
	 */
	@ApiField("ext_property")
	private String extProperty;

	/**
	 * 创建时间
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;

	/**
	 * 完结时间
	 */
	@ApiField("gmt_end")
	private Date gmtEnd;

	/**
	 * 修改时间
	 */
	@ApiField("gmt_modified")
	private Date gmtModified;

	/**
	 * 幂等ID
	 */
	@ApiField("idempotent_id")
	private String idempotentId;

	/**
	 * 业务属性列表, 列表长度为10
	 */
	@ApiListField("info_values")
	@ApiField("string")
	private List<String> infoValues;

	/**
	 * 流程租户ID
	 */
	@ApiField("instance_tnt_inst_id")
	private String instanceTntInstId;

	/**
	 * 用户Id
	 */
	@ApiField("ip_role_id")
	private String ipRoleId;

	/**
	 * 上一步操作
	 */
	@ApiField("last_operate")
	private String lastOperate;

	/**
	 * 紧急程度
	 */
	@ApiField("level")
	private Long level;

	/**
	 * 修改人用户域名
	 */
	@ApiField("modify_operator")
	private String modifyOperator;

	/**
	 * 修改者姓名
	 */
	@ApiField("modify_operator_name")
	private String modifyOperatorName;

	/**
	 * 工单名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 父工单id
	 */
	@ApiField("parent_ticket_id")
	private Long parentTicketId;

	/**
	 * 关联的某个版本的流程id
	 */
	@ApiField("process_id")
	private String processId;

	/**
	 * 预期结束时间
	 */
	@ApiField("should_finish_time")
	private Date shouldFinishTime;

	/**
	 * 状态
	 */
	@ApiField("state")
	private String state;

	/**
	 * 同步到的第三方平台
	 */
	@ApiField("third_party")
	private String thirdParty;

	/**
	 * 租户ID
	 */
	@ApiField("tnt_inst_id")
	private String tntInstId;

	/**
	 * 无线端工单详情地址
	 */
	@ApiField("wireless_detail_url")
	private String wirelessDetailUrl;

	public String getAttachment() {
		return this.attachment;
	}
	public void setAttachment(String attachment) {
		this.attachment = attachment;
	}

	public String getBizApp() {
		return this.bizApp;
	}
	public void setBizApp(String bizApp) {
		this.bizApp = bizApp;
	}

	public String getBizId() {
		return this.bizId;
	}
	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public String getBusinessContext() {
		return this.businessContext;
	}
	public void setBusinessContext(String businessContext) {
		this.businessContext = businessContext;
	}

	public Long getChangeVersion() {
		return this.changeVersion;
	}
	public void setChangeVersion(Long changeVersion) {
		this.changeVersion = changeVersion;
	}

	public String getConfigId() {
		return this.configId;
	}
	public void setConfigId(String configId) {
		this.configId = configId;
	}

	public String getCreateOperator() {
		return this.createOperator;
	}
	public void setCreateOperator(String createOperator) {
		this.createOperator = createOperator;
	}

	public String getCreateOperatorName() {
		return this.createOperatorName;
	}
	public void setCreateOperatorName(String createOperatorName) {
		this.createOperatorName = createOperatorName;
	}

	public String getDealUrl() {
		return this.dealUrl;
	}
	public void setDealUrl(String dealUrl) {
		this.dealUrl = dealUrl;
	}

	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public String getDetailUrl() {
		return this.detailUrl;
	}
	public void setDetailUrl(String detailUrl) {
		this.detailUrl = detailUrl;
	}

	public String getDisplayName() {
		return this.displayName;
	}
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public String getDomainId() {
		return this.domainId;
	}
	public void setDomainId(String domainId) {
		this.domainId = domainId;
	}

	public Long getDuration() {
		return this.duration;
	}
	public void setDuration(Long duration) {
		this.duration = duration;
	}

	public String getExtProperty() {
		return this.extProperty;
	}
	public void setExtProperty(String extProperty) {
		this.extProperty = extProperty;
	}

	public Date getGmtCreate() {
		return this.gmtCreate;
	}
	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public Date getGmtEnd() {
		return this.gmtEnd;
	}
	public void setGmtEnd(Date gmtEnd) {
		this.gmtEnd = gmtEnd;
	}

	public Date getGmtModified() {
		return this.gmtModified;
	}
	public void setGmtModified(Date gmtModified) {
		this.gmtModified = gmtModified;
	}

	public String getIdempotentId() {
		return this.idempotentId;
	}
	public void setIdempotentId(String idempotentId) {
		this.idempotentId = idempotentId;
	}

	public List<String> getInfoValues() {
		return this.infoValues;
	}
	public void setInfoValues(List<String> infoValues) {
		this.infoValues = infoValues;
	}

	public String getInstanceTntInstId() {
		return this.instanceTntInstId;
	}
	public void setInstanceTntInstId(String instanceTntInstId) {
		this.instanceTntInstId = instanceTntInstId;
	}

	public String getIpRoleId() {
		return this.ipRoleId;
	}
	public void setIpRoleId(String ipRoleId) {
		this.ipRoleId = ipRoleId;
	}

	public String getLastOperate() {
		return this.lastOperate;
	}
	public void setLastOperate(String lastOperate) {
		this.lastOperate = lastOperate;
	}

	public Long getLevel() {
		return this.level;
	}
	public void setLevel(Long level) {
		this.level = level;
	}

	public String getModifyOperator() {
		return this.modifyOperator;
	}
	public void setModifyOperator(String modifyOperator) {
		this.modifyOperator = modifyOperator;
	}

	public String getModifyOperatorName() {
		return this.modifyOperatorName;
	}
	public void setModifyOperatorName(String modifyOperatorName) {
		this.modifyOperatorName = modifyOperatorName;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public Long getParentTicketId() {
		return this.parentTicketId;
	}
	public void setParentTicketId(Long parentTicketId) {
		this.parentTicketId = parentTicketId;
	}

	public String getProcessId() {
		return this.processId;
	}
	public void setProcessId(String processId) {
		this.processId = processId;
	}

	public Date getShouldFinishTime() {
		return this.shouldFinishTime;
	}
	public void setShouldFinishTime(Date shouldFinishTime) {
		this.shouldFinishTime = shouldFinishTime;
	}

	public String getState() {
		return this.state;
	}
	public void setState(String state) {
		this.state = state;
	}

	public String getThirdParty() {
		return this.thirdParty;
	}
	public void setThirdParty(String thirdParty) {
		this.thirdParty = thirdParty;
	}

	public String getTntInstId() {
		return this.tntInstId;
	}
	public void setTntInstId(String tntInstId) {
		this.tntInstId = tntInstId;
	}

	public String getWirelessDetailUrl() {
		return this.wirelessDetailUrl;
	}
	public void setWirelessDetailUrl(String wirelessDetailUrl) {
		this.wirelessDetailUrl = wirelessDetailUrl;
	}

}
