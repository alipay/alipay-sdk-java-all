package com.alipay.api.response;

import java.util.Date;
import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.FixCooperationDTO;
import com.alipay.api.domain.FixExtData;
import com.alipay.api.domain.FixFileInfo;
import com.alipay.api.domain.FixProblemDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.fix.task.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 16:55:10
 */
public class AlipayCommerceFixTaskQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8482686338852458512L;

	/** 
	 * 部分规则场景下，对提报问题进行的二次分类
	 */
	@ApiField("biz_type")
	private String bizType;

	/** 
	 * 任务完结时间。用户确认后的时间。如果业务场景中不需要用户确认，则这里和start_confirm_time的值一样。
	 */
	@ApiField("close_time")
	private Date closeTime;

	/** 
	 * 问题的处理详情，json格式的数据。数据详情请与业务接口人沟通，。
	 */
	@ApiField("conclusion_ext_info")
	private String conclusionExtInfo;

	/** 
	 * 处理结论的说明
	 */
	@ApiField("conclusion_memo")
	private String conclusionMemo;

	/** 
	 * 处理结论-问题类型
	 */
	@ApiField("conclusion_type")
	private String conclusionType;

	/** 
	 * 工单关联的协作任务。一个工单可能涉及多方处理，这个列表包含全部的处理历史信息
	 */
	@ApiListField("cooperations")
	@ApiField("fix_cooperation_d_t_o")
	private List<FixCooperationDTO> cooperations;

	/** 
	 * 当前处理中的协作任务id
	 */
	@ApiField("current_cooperation_id")
	private Long currentCooperationId;

	/** 
	 * 当前处理人的名字，脱敏显示
	 */
	@ApiField("duty_owner_name")
	private String dutyOwnerName;

	/** 
	 * 当前处理人的联系方式，脱敏显示
	 */
	@ApiField("duty_owner_phone")
	private String dutyOwnerPhone;

	/** 
	 * 定向开放场景中，可能同时支持多个业务场景，允许各业务场景自定义个性化提交的数据。数据格式请提前与业务接口人确定
	 */
	@ApiListField("extra_info")
	@ApiField("fix_ext_data")
	private List<FixExtData> extraInfo;

	/** 
	 * 工单中包含的文件信息，可以通过download_url下载到文件内容
	 */
	@ApiListField("files")
	@ApiField("fix_file_info")
	private List<FixFileInfo> files;

	/** 
	 * 任务首次受理时间。代表任务开始处理
	 */
	@ApiField("first_apply_time")
	private Date firstApplyTime;

	/** 
	 * 工单的创建时间
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;

	/** 
	 * 用户的问题是否解决。yes:已解决;no:未解决
	 */
	@ApiField("is_resolved")
	private String isResolved;

	/** 
	 * 首次提报时的问题分类信息。
	 */
	@ApiField("original_problem")
	private FixProblemDTO originalProblem;

	/** 
	 * 当前处理方的公司名，脱敏显示
	 */
	@ApiField("owner_name")
	private String ownerName;

	/** 
	 * 当前的问题分类描述信息。问题可能多次流转，这里是当前最新的问题分类描述信息
	 */
	@ApiField("problem")
	private FixProblemDTO problem;

	/** 
	 * 工单的规则场景
	 */
	@ApiField("rule_scene")
	private String ruleScene;

	/** 
	 * 任务开始确认时间。代表处理方已经完成任务处理，等待提交问题的用户确认
	 */
	@ApiField("start_confirm_time")
	private Date startConfirmTime;

	/** 
	 * 工单当前状态
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 当前状态的中文名
	 */
	@ApiField("status_name")
	private String statusName;

	/** 
	 * 用来标识任务类型。 枚举值:techConsult:技术咨询;malfunctionReport:设备报障
	 */
	@ApiField("task_category")
	private String taskCategory;

	/** 
	 * 工单的任务类型
	 */
	@ApiField("task_type")
	private String taskType;

	/** 
	 * 问题未能解决的原因说明
	 */
	@ApiField("unresolved_reason")
	private String unresolvedReason;

	public void setBizType(String bizType) {
		this.bizType = bizType;
	}
	public String getBizType( ) {
		return this.bizType;
	}

	public void setCloseTime(Date closeTime) {
		this.closeTime = closeTime;
	}
	public Date getCloseTime( ) {
		return this.closeTime;
	}

	public void setConclusionExtInfo(String conclusionExtInfo) {
		this.conclusionExtInfo = conclusionExtInfo;
	}
	public String getConclusionExtInfo( ) {
		return this.conclusionExtInfo;
	}

	public void setConclusionMemo(String conclusionMemo) {
		this.conclusionMemo = conclusionMemo;
	}
	public String getConclusionMemo( ) {
		return this.conclusionMemo;
	}

	public void setConclusionType(String conclusionType) {
		this.conclusionType = conclusionType;
	}
	public String getConclusionType( ) {
		return this.conclusionType;
	}

	public void setCooperations(List<FixCooperationDTO> cooperations) {
		this.cooperations = cooperations;
	}
	public List<FixCooperationDTO> getCooperations( ) {
		return this.cooperations;
	}

	public void setCurrentCooperationId(Long currentCooperationId) {
		this.currentCooperationId = currentCooperationId;
	}
	public Long getCurrentCooperationId( ) {
		return this.currentCooperationId;
	}

	public void setDutyOwnerName(String dutyOwnerName) {
		this.dutyOwnerName = dutyOwnerName;
	}
	public String getDutyOwnerName( ) {
		return this.dutyOwnerName;
	}

	public void setDutyOwnerPhone(String dutyOwnerPhone) {
		this.dutyOwnerPhone = dutyOwnerPhone;
	}
	public String getDutyOwnerPhone( ) {
		return this.dutyOwnerPhone;
	}

	public void setExtraInfo(List<FixExtData> extraInfo) {
		this.extraInfo = extraInfo;
	}
	public List<FixExtData> getExtraInfo( ) {
		return this.extraInfo;
	}

	public void setFiles(List<FixFileInfo> files) {
		this.files = files;
	}
	public List<FixFileInfo> getFiles( ) {
		return this.files;
	}

	public void setFirstApplyTime(Date firstApplyTime) {
		this.firstApplyTime = firstApplyTime;
	}
	public Date getFirstApplyTime( ) {
		return this.firstApplyTime;
	}

	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}
	public Date getGmtCreate( ) {
		return this.gmtCreate;
	}

	public void setIsResolved(String isResolved) {
		this.isResolved = isResolved;
	}
	public String getIsResolved( ) {
		return this.isResolved;
	}

	public void setOriginalProblem(FixProblemDTO originalProblem) {
		this.originalProblem = originalProblem;
	}
	public FixProblemDTO getOriginalProblem( ) {
		return this.originalProblem;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public String getOwnerName( ) {
		return this.ownerName;
	}

	public void setProblem(FixProblemDTO problem) {
		this.problem = problem;
	}
	public FixProblemDTO getProblem( ) {
		return this.problem;
	}

	public void setRuleScene(String ruleScene) {
		this.ruleScene = ruleScene;
	}
	public String getRuleScene( ) {
		return this.ruleScene;
	}

	public void setStartConfirmTime(Date startConfirmTime) {
		this.startConfirmTime = startConfirmTime;
	}
	public Date getStartConfirmTime( ) {
		return this.startConfirmTime;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

	public void setStatusName(String statusName) {
		this.statusName = statusName;
	}
	public String getStatusName( ) {
		return this.statusName;
	}

	public void setTaskCategory(String taskCategory) {
		this.taskCategory = taskCategory;
	}
	public String getTaskCategory( ) {
		return this.taskCategory;
	}

	public void setTaskType(String taskType) {
		this.taskType = taskType;
	}
	public String getTaskType( ) {
		return this.taskType;
	}

	public void setUnresolvedReason(String unresolvedReason) {
		this.unresolvedReason = unresolvedReason;
	}
	public String getUnresolvedReason( ) {
		return this.unresolvedReason;
	}

}
