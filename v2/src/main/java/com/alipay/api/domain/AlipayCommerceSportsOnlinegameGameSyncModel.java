package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 赛事信息同步
 *
 * @author auto create
 * @since 1.0, 2022-12-20 14:49:51
 */
public class AlipayCommerceSportsOnlinegameGameSyncModel extends AlipayObject {

	private static final long serialVersionUID = 2673497623488943433L;

	/**
	 * 赛事类型
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 金秋跑出风采
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 赛事结束时间
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * 文体侧赛事业务号
	 */
	@ApiField("game_id")
	private String gameId;

	/**
	 * 配合赛事总进度使用
	 */
	@ApiField("game_progress_unit")
	private String gameProgressUnit;

	/**
	 * 赛事总进度
	 */
	@ApiField("game_progress_value")
	private Long gameProgressValue;

	/**
	 * 2022跑遍中国-乐享中秋跑量挑战赛
	 */
	@ApiField("name")
	private String name;

	/**
	 * 三方赛事ID(唯一值)
	 */
	@ApiField("out_game_no")
	private String outGameNo;

	/**
	 * 中田赛事海报图片
	 */
	@ApiField("poster_url")
	private String posterUrl;

	/**
	 * 0代表上报条数无限制/1代表上报一条/n代表具体上报条数
	 */
	@ApiField("sports_data_limit_count")
	private Long sportsDataLimitCount;

	/**
	 * 支付宝运动
	 */
	@ApiField("sports_data_source")
	private String sportsDataSource;

	/**
	 * 运动类型
	 */
	@ApiField("sports_data_type")
	private String sportsDataType;

	/**
	 * 赛事开始时间
	 */
	@ApiField("start_time")
	private Date startTime;

	/**
	 * 上线
	 */
	@ApiField("status")
	private String status;

	/**
	 * 赛事中的子业务类型
	 */
	@ApiField("sub_biz_type")
	private String subBizType;

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getDesc() {
		return this.desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

	public Date getEndTime() {
		return this.endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public String getGameId() {
		return this.gameId;
	}
	public void setGameId(String gameId) {
		this.gameId = gameId;
	}

	public String getGameProgressUnit() {
		return this.gameProgressUnit;
	}
	public void setGameProgressUnit(String gameProgressUnit) {
		this.gameProgressUnit = gameProgressUnit;
	}

	public Long getGameProgressValue() {
		return this.gameProgressValue;
	}
	public void setGameProgressValue(Long gameProgressValue) {
		this.gameProgressValue = gameProgressValue;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getOutGameNo() {
		return this.outGameNo;
	}
	public void setOutGameNo(String outGameNo) {
		this.outGameNo = outGameNo;
	}

	public String getPosterUrl() {
		return this.posterUrl;
	}
	public void setPosterUrl(String posterUrl) {
		this.posterUrl = posterUrl;
	}

	public Long getSportsDataLimitCount() {
		return this.sportsDataLimitCount;
	}
	public void setSportsDataLimitCount(Long sportsDataLimitCount) {
		this.sportsDataLimitCount = sportsDataLimitCount;
	}

	public String getSportsDataSource() {
		return this.sportsDataSource;
	}
	public void setSportsDataSource(String sportsDataSource) {
		this.sportsDataSource = sportsDataSource;
	}

	public String getSportsDataType() {
		return this.sportsDataType;
	}
	public void setSportsDataType(String sportsDataType) {
		this.sportsDataType = sportsDataType;
	}

	public Date getStartTime() {
		return this.startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getSubBizType() {
		return this.subBizType;
	}
	public void setSubBizType(String subBizType) {
		this.subBizType = subBizType;
	}

}
