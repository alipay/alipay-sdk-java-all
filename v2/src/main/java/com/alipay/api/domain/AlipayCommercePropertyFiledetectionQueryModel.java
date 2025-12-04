package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询上传图片检测结果接口
 *
 * @author auto create
 * @since 1.0, 2025-07-18 10:41:14
 */
public class AlipayCommercePropertyFiledetectionQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1522437376945334743L;

	/**
	 * 编码code
	 */
	@ApiField("code")
	private String code;

	/**
	 * 线圈id
	 */
	@ApiField("coil_id")
	private String coilId;

	/**
	 * 项目id
	 */
	@ApiField("community_id")
	private String communityId;

	/**
	 * 结束时间
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * ai检测结果
	 */
	@ApiField("file_ai_check")
	private Boolean fileAiCheck;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 页码
	 */
	@ApiField("page_no")
	private Long pageNo;

	/**
	 * 单页大小
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 点位id
	 */
	@ApiField("point_id")
	private String pointId;

	/**
	 * 图片二维码检测结果
	 */
	@ApiField("qrcode_check")
	private Boolean qrcodeCheck;

	/**
	 * 流水号
	 */
	@ApiField("serial_no")
	private String serialNo;

	/**
	 * 开始时间
	 */
	@ApiField("start_time")
	private Date startTime;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public String getCode() {
		return this.code;
	}
	public void setCode(String code) {
		this.code = code;
	}

	public String getCoilId() {
		return this.coilId;
	}
	public void setCoilId(String coilId) {
		this.coilId = coilId;
	}

	public String getCommunityId() {
		return this.communityId;
	}
	public void setCommunityId(String communityId) {
		this.communityId = communityId;
	}

	public Date getEndTime() {
		return this.endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public Boolean getFileAiCheck() {
		return this.fileAiCheck;
	}
	public void setFileAiCheck(Boolean fileAiCheck) {
		this.fileAiCheck = fileAiCheck;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public Long getPageNo() {
		return this.pageNo;
	}
	public void setPageNo(Long pageNo) {
		this.pageNo = pageNo;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public String getPointId() {
		return this.pointId;
	}
	public void setPointId(String pointId) {
		this.pointId = pointId;
	}

	public Boolean getQrcodeCheck() {
		return this.qrcodeCheck;
	}
	public void setQrcodeCheck(Boolean qrcodeCheck) {
		this.qrcodeCheck = qrcodeCheck;
	}

	public String getSerialNo() {
		return this.serialNo;
	}
	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}

	public Date getStartTime() {
		return this.startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
