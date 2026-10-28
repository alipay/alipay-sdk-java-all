package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-10-10 16:12:58
 */
public class AbilityItem extends AlipayObject {

	private static final long serialVersionUID = 5483867753733594262L;

	/**
	 * 能力编码
	 */
	@ApiField("ability_code")
	private String abilityCode;

	/**
	 * 能力英文名称
	 */
	@ApiField("ability_name_en")
	private String abilityNameEn;

	/**
	 * 能力类型
	 */
	@ApiField("ability_type")
	private String abilityType;

	/**
	 * 能力版本
	 */
	@ApiField("ability_version")
	private String abilityVersion;

	/**
	 * null
	 */
	@ApiListField("cards")
	@ApiField("qianfan_card_item")
	private List<QianfanCardItem> cards;

	/**
	 * MCP schema 信息
	 */
	@ApiField("mcp_schema")
	private McpAbility mcpSchema;

	/**
	 * SKILL schema 信息
	 */
	@ApiField("skill_schema")
	private SkillAbility skillSchema;

	public String getAbilityCode() {
		return this.abilityCode;
	}
	public void setAbilityCode(String abilityCode) {
		this.abilityCode = abilityCode;
	}

	public String getAbilityNameEn() {
		return this.abilityNameEn;
	}
	public void setAbilityNameEn(String abilityNameEn) {
		this.abilityNameEn = abilityNameEn;
	}

	public String getAbilityType() {
		return this.abilityType;
	}
	public void setAbilityType(String abilityType) {
		this.abilityType = abilityType;
	}

	public String getAbilityVersion() {
		return this.abilityVersion;
	}
	public void setAbilityVersion(String abilityVersion) {
		this.abilityVersion = abilityVersion;
	}

	public List<QianfanCardItem> getCards() {
		return this.cards;
	}
	public void setCards(List<QianfanCardItem> cards) {
		this.cards = cards;
	}

	public McpAbility getMcpSchema() {
		return this.mcpSchema;
	}
	public void setMcpSchema(McpAbility mcpSchema) {
		this.mcpSchema = mcpSchema;
	}

	public SkillAbility getSkillSchema() {
		return this.skillSchema;
	}
	public void setSkillSchema(SkillAbility skillSchema) {
		this.skillSchema = skillSchema;
	}

}
