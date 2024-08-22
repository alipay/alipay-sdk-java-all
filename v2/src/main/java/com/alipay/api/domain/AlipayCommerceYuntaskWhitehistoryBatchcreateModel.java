package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 超导白名单批量创建
 *
 * @author auto create
 * @since 1.0, 2024-08-08 16:34:46
 */
public class AlipayCommerceYuntaskWhitehistoryBatchcreateModel extends AlipayObject {

	private static final long serialVersionUID = 5761342423841785757L;

	/**
	 * 操作人openid
	 */
	@ApiField("operate_open_id")
	private String operateOpenId;

	/**
	 * 操作人id
	 */
	@ApiField("operate_user_id")
	private String operateUserId;

	/**
	 * 超导任务模版id，在超导SaaS后台针对任务点击操作时，将对应的任务id传过来
	 */
	@ApiField("task_template_id")
	private String taskTemplateId;

	/**
	 * 白名单列表
	 */
	@ApiListField("white_list")
	@ApiField("yun_task_white_user_d_t_o")
	private List<YunTaskWhiteUserDTO> whiteList;

	public String getOperateOpenId() {
		return this.operateOpenId;
	}
	public void setOperateOpenId(String operateOpenId) {
		this.operateOpenId = operateOpenId;
	}

	public String getOperateUserId() {
		return this.operateUserId;
	}
	public void setOperateUserId(String operateUserId) {
		this.operateUserId = operateUserId;
	}

	public String getTaskTemplateId() {
		return this.taskTemplateId;
	}
	public void setTaskTemplateId(String taskTemplateId) {
		this.taskTemplateId = taskTemplateId;
	}

	public List<YunTaskWhiteUserDTO> getWhiteList() {
		return this.whiteList;
	}
	public void setWhiteList(List<YunTaskWhiteUserDTO> whiteList) {
		this.whiteList = whiteList;
	}

}
