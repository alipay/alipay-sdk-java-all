package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小游戏素材效果数据回传
 *
 * @author auto create
 * @since 1.0, 2026-09-21 17:27:53
 */
public class AlipayUserGamematerialDataSyncModel extends AlipayObject {

	private static final long serialVersionUID = 6751715865994418991L;

	/**
	 * 素材点击次数
	 */
	@ApiField("click_pv")
	private Long clickPv;

	/**
	 * 素材点击用户数
	 */
	@ApiField("click_uv")
	private Long clickUv;

	/**
	 * 素材效果数据的统计时间，以日期为维度更新数据。
	 */
	@ApiField("data_time")
	private Date dataTime;

	/**
	 * 素材曝光次数
	 */
	@ApiField("expose_pv")
	private Long exposePv;

	/**
	 * 素材曝光用户数
	 */
	@ApiField("expose_uv")
	private Long exposeUv;

	/**
	 * 效果数据对应的素材 ID，素材ID由平台定义通知CP
	 */
	@ApiField("material_id")
	private String materialId;

	public Long getClickPv() {
		return this.clickPv;
	}
	public void setClickPv(Long clickPv) {
		this.clickPv = clickPv;
	}

	public Long getClickUv() {
		return this.clickUv;
	}
	public void setClickUv(Long clickUv) {
		this.clickUv = clickUv;
	}

	public Date getDataTime() {
		return this.dataTime;
	}
	public void setDataTime(Date dataTime) {
		this.dataTime = dataTime;
	}

	public Long getExposePv() {
		return this.exposePv;
	}
	public void setExposePv(Long exposePv) {
		this.exposePv = exposePv;
	}

	public Long getExposeUv() {
		return this.exposeUv;
	}
	public void setExposeUv(Long exposeUv) {
		this.exposeUv = exposeUv;
	}

	public String getMaterialId() {
		return this.materialId;
	}
	public void setMaterialId(String materialId) {
		this.materialId = materialId;
	}

}
