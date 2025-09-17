package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 亚运一站通资产vo
 *
 * @author auto create
 * @since 1.0, 2023-08-28 20:43:56
 */
public class AvatarAsianAssetVO extends AlipayObject {

	private static final long serialVersionUID = 2469236566893461712L;

	/**
	 * 额外参数
	 */
	@ApiField("ext_model_info")
	private String extModelInfo;

	/**
	 * 获取配置
	 */
	@ApiField("give_config")
	private GiveConfigVO giveConfig;

	/**
	 * 获取方式
	 */
	@ApiField("give_type")
	private String giveType;

	/**
	 * gltf模型
	 */
	@ApiField("gltf_url")
	private String gltfUrl;

	/**
	 * 获取/创建时间
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;

	/**
	 * 资产id
	 */
	@ApiField("id")
	private String id;

	/**
	 * 资产初始动作
	 */
	@ApiField("init_behavior")
	private String initBehavior;

	/**
	 * 资产名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 预览图
	 */
	@ApiField("preview")
	private String preview;

	/**
	 * 是否拥有
	 */
	@ApiField("reward_status")
	private String rewardStatus;

	/**
	 * 标签名
	 */
	@ApiField("tag_name")
	private String tagName;

	/**
	 * 资产类型
	 */
	@ApiField("type")
	private String type;

	/**
	 * 资产类型名称
	 */
	@ApiField("type_name")
	private String typeName;

	public String getExtModelInfo() {
		return this.extModelInfo;
	}
	public void setExtModelInfo(String extModelInfo) {
		this.extModelInfo = extModelInfo;
	}

	public GiveConfigVO getGiveConfig() {
		return this.giveConfig;
	}
	public void setGiveConfig(GiveConfigVO giveConfig) {
		this.giveConfig = giveConfig;
	}

	public String getGiveType() {
		return this.giveType;
	}
	public void setGiveType(String giveType) {
		this.giveType = giveType;
	}

	public String getGltfUrl() {
		return this.gltfUrl;
	}
	public void setGltfUrl(String gltfUrl) {
		this.gltfUrl = gltfUrl;
	}

	public Date getGmtCreate() {
		return this.gmtCreate;
	}
	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getInitBehavior() {
		return this.initBehavior;
	}
	public void setInitBehavior(String initBehavior) {
		this.initBehavior = initBehavior;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getPreview() {
		return this.preview;
	}
	public void setPreview(String preview) {
		this.preview = preview;
	}

	public String getRewardStatus() {
		return this.rewardStatus;
	}
	public void setRewardStatus(String rewardStatus) {
		this.rewardStatus = rewardStatus;
	}

	public String getTagName() {
		return this.tagName;
	}
	public void setTagName(String tagName) {
		this.tagName = tagName;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public String getTypeName() {
		return this.typeName;
	}
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

}
