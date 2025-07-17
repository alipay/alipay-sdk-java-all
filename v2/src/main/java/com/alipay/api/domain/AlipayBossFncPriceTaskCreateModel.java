package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 金融科技业务价格任务创建接口
 *
 * @author auto create
 * @since 1.0, 2019-07-08 19:54:24
 */
public class AlipayBossFncPriceTaskCreateModel extends AlipayObject {

	private static final long serialVersionUID = 8561357791465413131L;

	/**
	 * 系统名称/开放平台appId
	 */
	@ApiField("app_name")
	private String appName;

	/**
	 * 价格任务请求详情参数，详见任务请求参数说明。
	 */
	@ApiField("apply_detail")
	private String applyDetail;

	/**
	 * 扩展属性（Map<String, String>的JSON对象）
key和value中不能有英文逗号及等于符号。
	 */
	@ApiField("context")
	private String context;

	/**
	 * 任务创建人
	 */
	@ApiField("create_user")
	private String createUser;

	/**
	 * 任务创建时间
	 */
	@ApiField("gmt_create")
	private String gmtCreate;

	/**
	 * 任务备注信息
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 外部业务号，系统根据out_biz_no + source 来进行幂等控制，因此同一个任务来源的外部业务单号必须要保证不重复
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 任务来源类型
	 */
	@ApiField("source")
	private String source;

	/**
	 * 任务子类型，标识是一个新增的任务还是一个变更的任务，新增/变更。
	 */
	@ApiField("sub_type")
	private String subType;

	/**
	 * 租户ID
	 */
	@ApiField("tnt_inst_id")
	private String tntInstId;

	/**
	 * 任务类型（价格任务，政策任务，etc）
	 */
	@ApiField("type")
	private String type;

	public String getAppName() {
		return this.appName;
	}
	public void setAppName(String appName) {
		this.appName = appName;
	}

	public String getApplyDetail() {
		return this.applyDetail;
	}
	public void setApplyDetail(String applyDetail) {
		this.applyDetail = applyDetail;
	}

	public String getContext() {
		return this.context;
	}
	public void setContext(String context) {
		this.context = context;
	}

	public String getCreateUser() {
		return this.createUser;
	}
	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	public String getGmtCreate() {
		return this.gmtCreate;
	}
	public void setGmtCreate(String gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

	public String getSubType() {
		return this.subType;
	}
	public void setSubType(String subType) {
		this.subType = subType;
	}

	public String getTntInstId() {
		return this.tntInstId;
	}
	public void setTntInstId(String tntInstId) {
		this.tntInstId = tntInstId;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
