package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 场景类型VO
 *
 * @author auto create
 * @since 1.0, 2022-03-29 16:18:23
 */
public class SceneTypeVO extends AlipayObject {

	private static final long serialVersionUID = 1478181656634818324L;

	/**
	 * 创建人域名
	 */
	@ApiField("creator")
	private String creator;

	/**
	 * 创建人花名
	 */
	@ApiField("creator_name")
	private String creatorName;

	/**
	 * 创建时间
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;

	/**
	 * 更新时间
	 */
	@ApiField("gmt_modified")
	private Date gmtModified;

	/**
	 * 主键
	 */
	@ApiField("id")
	private Long id;

	/**
	 * 最后修改人
	 */
	@ApiField("last_moder")
	private String lastModer;

	/**
	 * 修改人域名
	 */
	@ApiField("modifier")
	private String modifier;

	/**
	 * 修改人花名
	 */
	@ApiField("modifier_name")
	private String modifierName;

	/**
	 * 场景code
	 */
	@ApiField("scene_type_code")
	private String sceneTypeCode;

	/**
	 * 场景名称
	 */
	@ApiField("scene_type_name")
	private String sceneTypeName;

	/**
	 * 场景状态，默认生效状态为pass
	 */
	@ApiField("state")
	private String state;

	/**
	 * 租户ID
	 */
	@ApiField("tnt_inst_id")
	private String tntInstId;

	public String getCreator() {
		return this.creator;
	}
	public void setCreator(String creator) {
		this.creator = creator;
	}

	public String getCreatorName() {
		return this.creatorName;
	}
	public void setCreatorName(String creatorName) {
		this.creatorName = creatorName;
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

	public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public String getLastModer() {
		return this.lastModer;
	}
	public void setLastModer(String lastModer) {
		this.lastModer = lastModer;
	}

	public String getModifier() {
		return this.modifier;
	}
	public void setModifier(String modifier) {
		this.modifier = modifier;
	}

	public String getModifierName() {
		return this.modifierName;
	}
	public void setModifierName(String modifierName) {
		this.modifierName = modifierName;
	}

	public String getSceneTypeCode() {
		return this.sceneTypeCode;
	}
	public void setSceneTypeCode(String sceneTypeCode) {
		this.sceneTypeCode = sceneTypeCode;
	}

	public String getSceneTypeName() {
		return this.sceneTypeName;
	}
	public void setSceneTypeName(String sceneTypeName) {
		this.sceneTypeName = sceneTypeName;
	}

	public String getState() {
		return this.state;
	}
	public void setState(String state) {
		this.state = state;
	}

	public String getTntInstId() {
		return this.tntInstId;
	}
	public void setTntInstId(String tntInstId) {
		this.tntInstId = tntInstId;
	}

}
