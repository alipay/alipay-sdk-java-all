package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 创建签约链接
 *
 * @author auto create
 * @since 1.0, 2025-10-23 11:44:15
 */
public class AlipayCommerceMedicalHealthcaSignqrurlCreateModel extends AlipayObject {

	private static final long serialVersionUID = 8591452295468868287L;

	/**
	 * 业务标识
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 签署文件ID
	 */
	@ApiField("file_id")
	private String fileId;

	/**
	 * 签署文件名称
	 */
	@ApiField("file_name")
	private String fileName;

	/**
	 * 签署页码
	 */
	@ApiField("pos_page")
	private Long posPage;

	/**
	 * 签署横坐标 像素px
	 */
	@ApiField("pos_x")
	private Long posX;

	/**
	 * 签署纵坐标，像素px
	 */
	@ApiField("pos_y")
	private Long posY;

	/**
	 * 签署完成后的重定向链接，只有签署成功才会跳转
	 */
	@ApiField("redirect_url")
	private String redirectUrl;

	/**
	 * 请求唯一标识
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 印章图片高度，像素px
	 */
	@ApiField("seal_height")
	private Long sealHeight;

	/**
	 * 印章图片宽度，像素px
	 */
	@ApiField("seal_width")
	private Long sealWidth;

	/**
	 * 签署身份证号
	 */
	@ApiField("sign_id_card_no")
	private String signIdCardNo;

	/**
	 * 签署姓名
	 */
	@ApiField("sign_name")
	private String signName;

	/**
	 * 签署业务原地址跳转链接，只有签署成功才会跳转
	 */
	@ApiField("source_url")
	private String sourceUrl;

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getFileId() {
		return this.fileId;
	}
	public void setFileId(String fileId) {
		this.fileId = fileId;
	}

	public String getFileName() {
		return this.fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public Long getPosPage() {
		return this.posPage;
	}
	public void setPosPage(Long posPage) {
		this.posPage = posPage;
	}

	public Long getPosX() {
		return this.posX;
	}
	public void setPosX(Long posX) {
		this.posX = posX;
	}

	public Long getPosY() {
		return this.posY;
	}
	public void setPosY(Long posY) {
		this.posY = posY;
	}

	public String getRedirectUrl() {
		return this.redirectUrl;
	}
	public void setRedirectUrl(String redirectUrl) {
		this.redirectUrl = redirectUrl;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getSealHeight() {
		return this.sealHeight;
	}
	public void setSealHeight(Long sealHeight) {
		this.sealHeight = sealHeight;
	}

	public Long getSealWidth() {
		return this.sealWidth;
	}
	public void setSealWidth(Long sealWidth) {
		this.sealWidth = sealWidth;
	}

	public String getSignIdCardNo() {
		return this.signIdCardNo;
	}
	public void setSignIdCardNo(String signIdCardNo) {
		this.signIdCardNo = signIdCardNo;
	}

	public String getSignName() {
		return this.signName;
	}
	public void setSignName(String signName) {
		this.signName = signName;
	}

	public String getSourceUrl() {
		return this.sourceUrl;
	}
	public void setSourceUrl(String sourceUrl) {
		this.sourceUrl = sourceUrl;
	}

}
