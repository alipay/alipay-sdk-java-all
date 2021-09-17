package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 哈罗单车选址任务提交
 *
 * @author auto create
 * @since 1.0, 2020-10-21 10:34:20
 */
public class AlipayDataAiserviceHellobikeSiteSubmitModel extends AlipayObject {

	private static final long serialVersionUID = 1586482993863823265L;

	/**
	 * 接口版本号
	 */
	@ApiField("app_version")
	private String appVersion;

	/**
	 * 待输出城市
	 */
	@ApiField("city")
	private String city;

	/**
	 * 期望输出日期：YYYY-MM-DD
	 */
	@ApiField("end_date")
	private String endDate;

	/**
	 * 禁停区域
	 */
	@ApiListField("exc_fence")
	@ApiField("string")
	private List<String> excFence;

	/**
	 * 禁用poi
	 */
	@ApiListField("exc_poi")
	@ApiField("string")
	private List<String> excPoi;

	/**
	 * 拓展字段
	 */
	@ApiField("ext_param")
	private String extParam;

	/**
	 * 运营区围栏
	 */
	@ApiListField("fence")
	@ApiField("string")
	private List<String> fence;

	/**
	 * 站点缺口
	 */
	@ApiField("num")
	private Long num;

	/**
	 * 推荐poi
	 */
	@ApiListField("rec_poi")
	@ApiField("string")
	private List<String> recPoi;

	/**
	 * 站点大小：长cm*宽cm
	 */
	@ApiField("size")
	private String size;

	/**
	 * 任务名称
	 */
	@ApiField("title")
	private String title;

	/**
	 * 枚举：0 助力车站点/ 1 单车站点/ 2 其他
	 */
	@ApiField("type")
	private Long type;

	public String getAppVersion() {
		return this.appVersion;
	}
	public void setAppVersion(String appVersion) {
		this.appVersion = appVersion;
	}

	public String getCity() {
		return this.city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	public String getEndDate() {
		return this.endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public List<String> getExcFence() {
		return this.excFence;
	}
	public void setExcFence(List<String> excFence) {
		this.excFence = excFence;
	}

	public List<String> getExcPoi() {
		return this.excPoi;
	}
	public void setExcPoi(List<String> excPoi) {
		this.excPoi = excPoi;
	}

	public String getExtParam() {
		return this.extParam;
	}
	public void setExtParam(String extParam) {
		this.extParam = extParam;
	}

	public List<String> getFence() {
		return this.fence;
	}
	public void setFence(List<String> fence) {
		this.fence = fence;
	}

	public Long getNum() {
		return this.num;
	}
	public void setNum(Long num) {
		this.num = num;
	}

	public List<String> getRecPoi() {
		return this.recPoi;
	}
	public void setRecPoi(List<String> recPoi) {
		this.recPoi = recPoi;
	}

	public String getSize() {
		return this.size;
	}
	public void setSize(String size) {
		this.size = size;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public Long getType() {
		return this.type;
	}
	public void setType(Long type) {
		this.type = type;
	}

}
