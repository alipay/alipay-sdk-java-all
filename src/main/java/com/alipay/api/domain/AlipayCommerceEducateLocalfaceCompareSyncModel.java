package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 封闭式教育场景-本地人脸比对结果同步
 *
 * @author auto create
 * @since 1.0, 2019-07-23 10:19:22
 */
public class AlipayCommerceEducateLocalfaceCompareSyncModel extends AlipayObject {

	private static final long serialVersionUID = 4179253264465772193L;

	/**
	 * 算法版本
	 */
	@ApiField("alg_ver")
	private String algVer;

	/**
	 * 图片encode base64处理后的字符串
	 */
	@ApiField("auth_img")
	private String authImg;

	/**
	 * SCHOOL_FACE_PAYMENT: 校园刷脸支付
SCHOOL_ENTRANCE_GUARD:校园门禁
	 */
	@ApiField("biz_code")
	private String bizCode;

	/**
	 * 业务流水唯一ID
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 拓展参数
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 2D或者3D，默认2D
	 */
	@ApiField("face_data_type")
	private String faceDataType;

	/**
	 * 人脸本地1:N比对后的用户ID
	 */
	@ApiField("fuid")
	private String fuid;

	/**
	 * ISV的名称
	 */
	@ApiField("isv_name")
	private String isvName;

	/**
	 * 学校机构编码
	 */
	@ApiField("organize_id")
	private String organizeId;

	/**
	 * 图片质量分
	 */
	@ApiField("quality")
	private String quality;

	/**
	 * 人脸坐标点
	 */
	@ApiField("rect")
	private String rect;

	/**
	 * 人脸本地比对分
	 */
	@ApiField("score")
	private String score;

	public String getAlgVer() {
		return this.algVer;
	}
	public void setAlgVer(String algVer) {
		this.algVer = algVer;
	}

	public String getAuthImg() {
		return this.authImg;
	}
	public void setAuthImg(String authImg) {
		this.authImg = authImg;
	}

	public String getBizCode() {
		return this.bizCode;
	}
	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}

	public String getBizId() {
		return this.bizId;
	}
	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getFaceDataType() {
		return this.faceDataType;
	}
	public void setFaceDataType(String faceDataType) {
		this.faceDataType = faceDataType;
	}

	public String getFuid() {
		return this.fuid;
	}
	public void setFuid(String fuid) {
		this.fuid = fuid;
	}

	public String getIsvName() {
		return this.isvName;
	}
	public void setIsvName(String isvName) {
		this.isvName = isvName;
	}

	public String getOrganizeId() {
		return this.organizeId;
	}
	public void setOrganizeId(String organizeId) {
		this.organizeId = organizeId;
	}

	public String getQuality() {
		return this.quality;
	}
	public void setQuality(String quality) {
		this.quality = quality;
	}

	public String getRect() {
		return this.rect;
	}
	public void setRect(String rect) {
		this.rect = rect;
	}

	public String getScore() {
		return this.score;
	}
	public void setScore(String score) {
		this.score = score;
	}

}
