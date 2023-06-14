package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 签呗电子签约合同模板配置保存服务，时间组件框。
 *
 * @author auto create
 * @since 1.0, 2023-04-14 14:32:52
 */
public class TimeStampRectOpenVO extends AlipayObject {

	private static final long serialVersionUID = 1524586829774848397L;

	/**
	 * X轴偏移量，相对当前页左下角原点的X轴偏移量，非负数值，最大取值497，由用户输入，请注意取值范围。
	 */
	@ApiField("offset_x")
	private Long offsetX;

	/**
	 * Y轴偏移量，相对当前页左下角原点的Y轴偏移量，非负数值，最大取值744，由用户输入，请注意取值范围。
	 */
	@ApiField("offset_y")
	private Long offsetY;

	/**
	 * 组件所属页，页从1开始，由用户传入。
	 */
	@ApiField("page")
	private Long page;

	/**
	 * 组件ID，当前合同模板所有组件中唯一值，由用户传入。
	 */
	@ApiField("rect_id")
	private String rectId;

	/**
	 * 组件名称，非唯一值，由用户传入。
	 */
	@ApiField("rect_name")
	private String rectName;

	/**
	 * 组件样式，非必填，含有默认值。
	 */
	@ApiField("rect_style")
	private SignatoryStyle rectStyle;

	/**
	 * 企业章组件内是否必须签章，默认为true.
	 */
	@ApiField("required")
	private Boolean required;

	/**
	 * 时间格式展示，例如"yyyy-MM-dd"。
	 */
	@ApiField("time_format")
	private String timeFormat;

	public Long getOffsetX() {
		return this.offsetX;
	}
	public void setOffsetX(Long offsetX) {
		this.offsetX = offsetX;
	}

	public Long getOffsetY() {
		return this.offsetY;
	}
	public void setOffsetY(Long offsetY) {
		this.offsetY = offsetY;
	}

	public Long getPage() {
		return this.page;
	}
	public void setPage(Long page) {
		this.page = page;
	}

	public String getRectId() {
		return this.rectId;
	}
	public void setRectId(String rectId) {
		this.rectId = rectId;
	}

	public String getRectName() {
		return this.rectName;
	}
	public void setRectName(String rectName) {
		this.rectName = rectName;
	}

	public SignatoryStyle getRectStyle() {
		return this.rectStyle;
	}
	public void setRectStyle(SignatoryStyle rectStyle) {
		this.rectStyle = rectStyle;
	}

	public Boolean getRequired() {
		return this.required;
	}
	public void setRequired(Boolean required) {
		this.required = required;
	}

	public String getTimeFormat() {
		return this.timeFormat;
	}
	public void setTimeFormat(String timeFormat) {
		this.timeFormat = timeFormat;
	}

}
