package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 健康自测量表基础信息列表查询
 *
 * @author auto create
 * @since 1.0, 2025-02-17 15:47:06
 */
public class GaugeTypeListDTO extends AlipayObject {

	private static final long serialVersionUID = 5279666347839917812L;

	/**
	 * 量表图标
	 */
	@ApiField("icon_url")
	private String iconUrl;

	/**
	 * 当前类型下的具体量表列表
	 */
	@ApiListField("records")
	@ApiField("gauge_type_info_d_t_o")
	private List<GaugeTypeInfoDTO> records;

	/**
	 * 量表分类
	 */
	@ApiField("type")
	private String type;

	public String getIconUrl() {
		return this.iconUrl;
	}
	public void setIconUrl(String iconUrl) {
		this.iconUrl = iconUrl;
	}

	public List<GaugeTypeInfoDTO> getRecords() {
		return this.records;
	}
	public void setRecords(List<GaugeTypeInfoDTO> records) {
		this.records = records;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
