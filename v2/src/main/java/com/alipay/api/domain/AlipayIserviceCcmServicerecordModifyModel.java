package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 变更服务记录
 *
 * @author auto create
 * @since 1.0, 2020-12-14 10:32:41
 */
public class AlipayIserviceCcmServicerecordModifyModel extends AlipayObject {

	private static final long serialVersionUID = 4175673474478743444L;

	/**
	 * 来电唯一标识
	 */
	@ApiField("acid")
	private String acid;

	/**
	 * 客服坐席号(软电话中定义的)
	 */
	@ApiField("aid")
	private String aid;

	/**
	 * 主叫号码
	 */
	@ApiField("ani")
	private String ani;

	/**
	 * 恒生专用来电唯一标识
	 */
	@ApiField("asid")
	private String asid;

	/**
	 * 类目信息(详细信息请参考具体类型描述)
	 */
	@ApiField("category_list")
	private ServiceRecordCatRequest categoryList;

	/**
	 * 标准时间格式：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("chat_begin_time")
	private Date chatBeginTime;

	/**
	 * 标准时间格式：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("chat_end_time")
	private Date chatEndTime;

	/**
	 * 来电地址
	 */
	@ApiField("city")
	private String city;

	/**
	 * 创建者ID
	 */
	@ApiField("creator_id")
	private String creatorId;

	/**
	 * 先挂断方 AGENT:客服 CUSTOMER:客户
	 */
	@ApiField("discon_symbol")
	private String disconSymbol;

	/**
	 * 被叫号码
	 */
	@ApiField("dnis")
	private String dnis;

	/**
	 * 文件大小
	 */
	@ApiField("file_size")
	private Long fileSize;

	/**
	 * 创建时间(yyyy-MM-dd HH:mm:ss)
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;

	/**
	 * 修改时间
	 */
	@ApiField("gmt_modified")
	private Date gmtModified;

	/**
	 * 云客服服务记录ID
	 */
	@ApiField("id")
	private String id;

	/**
	 * 服务记录备注信息
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 修改人ID
	 */
	@ApiField("modifier_id")
	private String modifierId;

	/**
	 * 外呼任务ID
	 */
	@ApiField("outbound_task_id")
	private String outboundTaskId;

	/**
	 * 满意度 0:非常满意 1:满意 2:一般 3:不满意 4:非常不满意
	 */
	@ApiField("satisfaction")
	private String satisfaction;

	/**
	 * 满意度补充信息
	 */
	@ApiField("satisfaction_memo")
	private String satisfactionMemo;

	/**
	 * 1:客户来电 4:电话回访 5:网点服务 6:在线服务 7:外呼任务 8:手动外呼 9:在线离线留言
	 */
	@ApiField("service_source")
	private String serviceSource;

	/**
	 * 服务时长(单位:秒)
	 */
	@ApiField("service_time")
	private Long serviceTime;

	/**
	 * 技能组ID
	 */
	@ApiField("skillgroup_id")
	private String skillgroupId;

	/**
	 * 技能组名称(技能组ID对应的技能组名称)
	 */
	@ApiField("skillgroup_name")
	private String skillgroupName;

	/**
	 * 1:待处理
2:暂存
3:完结
4:废除
5:无效
6:未知
	 */
	@ApiField("status")
	private String status;

	/**
	 * 业务租户
	 */
	@ApiField("tnt_inst_id")
	private String tntInstId;

	/**
	 * 来访用户唯一标识ID
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * IVR验证结果 ROLE_N:未定位到用户 CERTNO_Y_PWD_Y:证件号码+交易密码验证通过 CERTNO_Y_PWD_N:证件号码验证通过+交易密码不通过 CERTNO_Y_PWD_UNKNOW:证件号码验证通过 PHONE_Y_PWD_Y:来电手机+交易密码验证通过 PHONE_Y_PWD_N:来电手机+交易密码未通过 PHONE_Y_PWD_UNKNOW:来电手机账户 SEARCH_Y_PWD_Y:搜索定位用户+推屏交易密码通过 SEARCH_Y_PWD_N:搜索定位用户+推屏交易密码未通过 SEARCH_Y_PWD_UNKNOW:搜索定位用户
	 */
	@ApiField("verify_result")
	private String verifyResult;

	public String getAcid() {
		return this.acid;
	}
	public void setAcid(String acid) {
		this.acid = acid;
	}

	public String getAid() {
		return this.aid;
	}
	public void setAid(String aid) {
		this.aid = aid;
	}

	public String getAni() {
		return this.ani;
	}
	public void setAni(String ani) {
		this.ani = ani;
	}

	public String getAsid() {
		return this.asid;
	}
	public void setAsid(String asid) {
		this.asid = asid;
	}

	public ServiceRecordCatRequest getCategoryList() {
		return this.categoryList;
	}
	public void setCategoryList(ServiceRecordCatRequest categoryList) {
		this.categoryList = categoryList;
	}

	public Date getChatBeginTime() {
		return this.chatBeginTime;
	}
	public void setChatBeginTime(Date chatBeginTime) {
		this.chatBeginTime = chatBeginTime;
	}

	public Date getChatEndTime() {
		return this.chatEndTime;
	}
	public void setChatEndTime(Date chatEndTime) {
		this.chatEndTime = chatEndTime;
	}

	public String getCity() {
		return this.city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	public String getCreatorId() {
		return this.creatorId;
	}
	public void setCreatorId(String creatorId) {
		this.creatorId = creatorId;
	}

	public String getDisconSymbol() {
		return this.disconSymbol;
	}
	public void setDisconSymbol(String disconSymbol) {
		this.disconSymbol = disconSymbol;
	}

	public String getDnis() {
		return this.dnis;
	}
	public void setDnis(String dnis) {
		this.dnis = dnis;
	}

	public Long getFileSize() {
		return this.fileSize;
	}
	public void setFileSize(Long fileSize) {
		this.fileSize = fileSize;
	}

	public Date getGmtCreate() {
		return this.gmtCreate;
	}
	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public Date getGmtModified() {
		return this.gmtModified;
	}
	public void setGmtModified(Date gmtModified) {
		this.gmtModified = gmtModified;
	}

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getModifierId() {
		return this.modifierId;
	}
	public void setModifierId(String modifierId) {
		this.modifierId = modifierId;
	}

	public String getOutboundTaskId() {
		return this.outboundTaskId;
	}
	public void setOutboundTaskId(String outboundTaskId) {
		this.outboundTaskId = outboundTaskId;
	}

	public String getSatisfaction() {
		return this.satisfaction;
	}
	public void setSatisfaction(String satisfaction) {
		this.satisfaction = satisfaction;
	}

	public String getSatisfactionMemo() {
		return this.satisfactionMemo;
	}
	public void setSatisfactionMemo(String satisfactionMemo) {
		this.satisfactionMemo = satisfactionMemo;
	}

	public String getServiceSource() {
		return this.serviceSource;
	}
	public void setServiceSource(String serviceSource) {
		this.serviceSource = serviceSource;
	}

	public Long getServiceTime() {
		return this.serviceTime;
	}
	public void setServiceTime(Long serviceTime) {
		this.serviceTime = serviceTime;
	}

	public String getSkillgroupId() {
		return this.skillgroupId;
	}
	public void setSkillgroupId(String skillgroupId) {
		this.skillgroupId = skillgroupId;
	}

	public String getSkillgroupName() {
		return this.skillgroupName;
	}
	public void setSkillgroupName(String skillgroupName) {
		this.skillgroupName = skillgroupName;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getTntInstId() {
		return this.tntInstId;
	}
	public void setTntInstId(String tntInstId) {
		this.tntInstId = tntInstId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getVerifyResult() {
		return this.verifyResult;
	}
	public void setVerifyResult(String verifyResult) {
		this.verifyResult = verifyResult;
	}

}
