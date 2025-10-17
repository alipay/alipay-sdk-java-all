package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 知识产权保护平台短剧创建
 *
 * @author auto create
 * @since 1.0, 2025-05-09 13:05:22
 */
public class AlipaySecurityDataIprShortplayCreateModel extends AlipayObject {

	private static final long serialVersionUID = 7789751582987654356L;

	/**
	 * 影视作品中的主要演员及演员所饰演的角色。例如演员张三在剧中饰演的人物角色叫李四，则表示为张三*李四，多个人物角色之间用英文逗号分隔
	 */
	@ApiField("actor_role")
	private String actorRole;

	/**
	 * 需要保存的影视作品类型，枚举值。根据实际影视作品类型传值。
	 */
	@ApiField("art_video_type")
	private String artVideoType;

	/**
	 * 作品授权结束时间，日期格式：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("authorize_end_date")
	private Date authorizeEndDate;

	/**
	 * 短剧在支付宝平台授权的对应生活号信息
	 */
	@ApiListField("authorize_life_app_list")
	@ApiField("authorize_life_app")
	private List<AuthorizeLifeApp> authorizeLifeAppList;

	/**
	 * 作品授权开始时间，日期格式：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("authorize_start_date")
	private Date authorizeStartDate;

	/**
	 * 标识外部数据来源渠道，不同渠道对接前请先与接口人确认，每个渠道唯一。错误使用会导致数据保存失败，对接前请务必确认。
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 作品主线内容概述
	 */
	@ApiField("content_summary")
	private String contentSummary;

	/**
	 * 授权材料先通过上传接口上传附件得到文件id
	 */
	@ApiListField("copyright_material_file_list")
	@ApiField("copyright_material_file")
	private List<CopyrightMaterialFile> copyrightMaterialFileList;

	/**
	 * 影视作品所属版权方公司名称
	 */
	@ApiField("copyright_owner")
	private String copyrightOwner;

	/**
	 * 影视作品总导演名称
	 */
	@ApiField("director")
	private String director;

	/**
	 * 影视作品总集数
	 */
	@ApiField("episode_count")
	private Long episodeCount;

	/**
	 * 渠道方作品唯一标识
	 */
	@ApiField("external_short_play_id")
	private String externalShortPlayId;

	/**
	 * 影视作品在相关平台或者部门备案通过后获取到的备案号
	 */
	@ApiField("filing_no")
	private String filingNo;

	/**
	 * 每一集短剧截帧数据压缩文件上传得到文件id
	 */
	@ApiListField("frame_file_list")
	@ApiField("short_play_frame_file")
	private List<ShortPlayFrameFile> frameFileList;

	/**
	 * 海报图片上传后获取到文件id
	 */
	@ApiField("poster_file_id")
	private String posterFileId;

	/**
	 * 影视作品发布上线时间，日期格式 yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("release_date")
	private Date releaseDate;

	/**
	 * 标识影视作品是否发布上线，Y-已上线；N-未上线
	 */
	@ApiField("release_flag")
	private String releaseFlag;

	/**
	 * 标识该影视作品是否渠道方所属平台自制
	 */
	@ApiField("self_made_flag")
	private String selfMadeFlag;

	/**
	 * 影视作品名称
	 */
	@ApiField("short_play_name")
	private String shortPlayName;

	/**
	 * 一部剧所有集数视频时长总和，单位分钟
	 */
	@ApiField("total_duration_minute")
	private Long totalDurationMinute;

	/**
	 * 标识该剧是否为紧急剧
	 */
	@ApiField("urgent_flag")
	private String urgentFlag;

	public String getActorRole() {
		return this.actorRole;
	}
	public void setActorRole(String actorRole) {
		this.actorRole = actorRole;
	}

	public String getArtVideoType() {
		return this.artVideoType;
	}
	public void setArtVideoType(String artVideoType) {
		this.artVideoType = artVideoType;
	}

	public Date getAuthorizeEndDate() {
		return this.authorizeEndDate;
	}
	public void setAuthorizeEndDate(Date authorizeEndDate) {
		this.authorizeEndDate = authorizeEndDate;
	}

	public List<AuthorizeLifeApp> getAuthorizeLifeAppList() {
		return this.authorizeLifeAppList;
	}
	public void setAuthorizeLifeAppList(List<AuthorizeLifeApp> authorizeLifeAppList) {
		this.authorizeLifeAppList = authorizeLifeAppList;
	}

	public Date getAuthorizeStartDate() {
		return this.authorizeStartDate;
	}
	public void setAuthorizeStartDate(Date authorizeStartDate) {
		this.authorizeStartDate = authorizeStartDate;
	}

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getContentSummary() {
		return this.contentSummary;
	}
	public void setContentSummary(String contentSummary) {
		this.contentSummary = contentSummary;
	}

	public List<CopyrightMaterialFile> getCopyrightMaterialFileList() {
		return this.copyrightMaterialFileList;
	}
	public void setCopyrightMaterialFileList(List<CopyrightMaterialFile> copyrightMaterialFileList) {
		this.copyrightMaterialFileList = copyrightMaterialFileList;
	}

	public String getCopyrightOwner() {
		return this.copyrightOwner;
	}
	public void setCopyrightOwner(String copyrightOwner) {
		this.copyrightOwner = copyrightOwner;
	}

	public String getDirector() {
		return this.director;
	}
	public void setDirector(String director) {
		this.director = director;
	}

	public Long getEpisodeCount() {
		return this.episodeCount;
	}
	public void setEpisodeCount(Long episodeCount) {
		this.episodeCount = episodeCount;
	}

	public String getExternalShortPlayId() {
		return this.externalShortPlayId;
	}
	public void setExternalShortPlayId(String externalShortPlayId) {
		this.externalShortPlayId = externalShortPlayId;
	}

	public String getFilingNo() {
		return this.filingNo;
	}
	public void setFilingNo(String filingNo) {
		this.filingNo = filingNo;
	}

	public List<ShortPlayFrameFile> getFrameFileList() {
		return this.frameFileList;
	}
	public void setFrameFileList(List<ShortPlayFrameFile> frameFileList) {
		this.frameFileList = frameFileList;
	}

	public String getPosterFileId() {
		return this.posterFileId;
	}
	public void setPosterFileId(String posterFileId) {
		this.posterFileId = posterFileId;
	}

	public Date getReleaseDate() {
		return this.releaseDate;
	}
	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}

	public String getReleaseFlag() {
		return this.releaseFlag;
	}
	public void setReleaseFlag(String releaseFlag) {
		this.releaseFlag = releaseFlag;
	}

	public String getSelfMadeFlag() {
		return this.selfMadeFlag;
	}
	public void setSelfMadeFlag(String selfMadeFlag) {
		this.selfMadeFlag = selfMadeFlag;
	}

	public String getShortPlayName() {
		return this.shortPlayName;
	}
	public void setShortPlayName(String shortPlayName) {
		this.shortPlayName = shortPlayName;
	}

	public Long getTotalDurationMinute() {
		return this.totalDurationMinute;
	}
	public void setTotalDurationMinute(Long totalDurationMinute) {
		this.totalDurationMinute = totalDurationMinute;
	}

	public String getUrgentFlag() {
		return this.urgentFlag;
	}
	public void setUrgentFlag(String urgentFlag) {
		this.urgentFlag = urgentFlag;
	}

}
