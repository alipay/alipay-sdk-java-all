package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 封闭式教育场景-本地人脸比对结果同步
 *
 * @author auto create
 * @since 1.0, 2021-07-23 15:20:11
 */
public class AlipayCommerceEducateLocalfaceCompareSyncModel extends AlipayObject {

	private static final long serialVersionUID = 3388354841814548673L;

	/**
	 * 客户端BehaviourLog-> aesCypher 参数
	 */
	@ApiField("aes_cypher")
	private String aesCypher;

	/**
	 * 参照示例传入
	 */
	@ApiField("alg_ver")
	private String algVer;

	/**
	 * 客户端BehaviourLog->imageBlob参数
	 */
	@ApiField("auth_img")
	private String authImg;

	/**
	 * SCHOOL_PAYMENT: 校园刷脸支付
SCHOOL_ENTRANCE_GUARD:校园门禁
	 */
	@ApiField("biz_code")
	private String bizCode;

	/**
	 * 业务流水唯一ID,isv自定义，保证唯一性
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
	 * 参数来源填写特征文件中对应的face_id 人脸本地1:N比对后的用户ID
	 */
	@ApiField("fuid")
	private String fuid;

	/**
	 * 必须是由支付宝业务方分配的英文简称(例如:yikeshixx),不能是中文
	 */
	@ApiField("isv_name")
	private String isvName;

	/**
	 * 国家统一分配的学校社会信用代码(institution_id)
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

	public String getAesCypher() {
		return this.aesCypher;
	}
	public void setAesCypher(String aesCypher) {
		this.aesCypher = aesCypher;
	}

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
