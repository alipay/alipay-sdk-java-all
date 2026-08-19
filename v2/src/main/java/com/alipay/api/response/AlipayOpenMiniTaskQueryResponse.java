package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.UserPhotoInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.task.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-07-28 17:57:52
 */
public class AlipayOpenMiniTaskQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8773641735358333733L;

	/** 
	 * 关联的文创id
	 */
	@ApiField("creative_id")
	private String creativeId;

	/** 
	 * 关联的购买订单号
	 */
	@ApiField("creative_order_no")
	private String creativeOrderNo;

	/** 
	 * 生成失败时的原因
	 */
	@ApiField("fail_reason")
	private String failReason;

	/** 
	 * 用户生图时的感想文案
	 */
	@ApiField("feeling_text")
	private String feelingText;

	/** 
	 * null
	 */
	@ApiListField("photos")
	@ApiField("user_photo_info")
	private List<UserPhotoInfo> photos;

	/** 
	 * 生成的手帐结果图片
	 */
	@ApiField("result_image_file_url")
	private String resultImageFileUrl;

	/** 
	 * 生成时的场景
	 */
	@ApiField("scene")
	private String scene;

	/** 
	 * 状态成功还是失败SUCCESS/FAILED/PROCESSING
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 查询任务的id,事件通知时传递的id
	 */
	@ApiField("task_id")
	private String taskId;

	/** 
	 * 模板类型journal / poster
	 */
	@ApiField("template_category")
	private String templateCategory;

	/** 
	 * 模板名称
	 */
	@ApiField("template_name")
	private String templateName;

	public void setCreativeId(String creativeId) {
		this.creativeId = creativeId;
	}
	public String getCreativeId( ) {
		return this.creativeId;
	}

	public void setCreativeOrderNo(String creativeOrderNo) {
		this.creativeOrderNo = creativeOrderNo;
	}
	public String getCreativeOrderNo( ) {
		return this.creativeOrderNo;
	}

	public void setFailReason(String failReason) {
		this.failReason = failReason;
	}
	public String getFailReason( ) {
		return this.failReason;
	}

	public void setFeelingText(String feelingText) {
		this.feelingText = feelingText;
	}
	public String getFeelingText( ) {
		return this.feelingText;
	}

	public void setPhotos(List<UserPhotoInfo> photos) {
		this.photos = photos;
	}
	public List<UserPhotoInfo> getPhotos( ) {
		return this.photos;
	}

	public void setResultImageFileUrl(String resultImageFileUrl) {
		this.resultImageFileUrl = resultImageFileUrl;
	}
	public String getResultImageFileUrl( ) {
		return this.resultImageFileUrl;
	}

	public void setScene(String scene) {
		this.scene = scene;
	}
	public String getScene( ) {
		return this.scene;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}
	public String getTaskId( ) {
		return this.taskId;
	}

	public void setTemplateCategory(String templateCategory) {
		this.templateCategory = templateCategory;
	}
	public String getTemplateCategory( ) {
		return this.templateCategory;
	}

	public void setTemplateName(String templateName) {
		this.templateName = templateName;
	}
	public String getTemplateName( ) {
		return this.templateName;
	}

}
