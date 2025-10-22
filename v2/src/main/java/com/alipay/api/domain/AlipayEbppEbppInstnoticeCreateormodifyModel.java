package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 机构公告创建或者修改
 *
 * @author auto create
 * @since 1.0, 2024-06-11 16:26:03
 */
public class AlipayEbppEbppInstnoticeCreateormodifyModel extends AlipayObject {

	private static final long serialVersionUID = 5563353695847567273L;

	/**
	 * 城市编码可选例如 320100：南京
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 城市名称：南京市
	 */
	@ApiField("city_name")
	private String cityName;

	/**
	 * 公告结束时间 格式：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("expired_time")
	private Date expiredTime;

	/**
	 * 公告内容字符串数组 ["公告内容"]
	 */
	@ApiListField("notice_content")
	@ApiField("string")
	private List<String> noticeContent;

	/**
	 * 省份编码
	 */
	@ApiField("province_code")
	private String provinceCode;

	/**
	 * 省份名称
	 */
	@ApiField("province_name")
	private String provinceName;

	/**
	 * 公告开始时间 格式：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("start_time")
	private Date startTime;

	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getCityName() {
		return this.cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public Date getExpiredTime() {
		return this.expiredTime;
	}
	public void setExpiredTime(Date expiredTime) {
		this.expiredTime = expiredTime;
	}

	public List<String> getNoticeContent() {
		return this.noticeContent;
	}
	public void setNoticeContent(List<String> noticeContent) {
		this.noticeContent = noticeContent;
	}

	public String getProvinceCode() {
		return this.provinceCode;
	}
	public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
	}

	public String getProvinceName() {
		return this.provinceName;
	}
	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}

	public Date getStartTime() {
		return this.startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

}
