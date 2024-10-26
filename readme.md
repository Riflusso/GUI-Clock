<h2>GUI Clock</h2>
<p><a href="https://github.com/Serilum/GUI-Clock"><img src="https://serilum.com/assets/data/logo/gui-clock.png"></a></p><h2>Download</h2>
<p>You can download GUI Clock on CurseForge and Modrinth:</p><p>&nbsp;&nbsp;CurseForge: &nbsp;&nbsp;<a href="https://curseforge.com/minecraft/mc-mods/gui-clock">https://curseforge.com/minecraft/mc-mods/gui-clock</a><br>&nbsp;&nbsp;Modrinth: &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="https://modrinth.com/mod/gui-clock">https://modrinth.com/mod/gui-clock</a></p>
<h2>Issue Tracker</h2>
<p>To keep a better overview of all mods, the issue tracker is located in a separate repository.<br>&nbsp;&nbsp;For issues, ideas, suggestions or anything else, please follow this link:</p>
<p>&nbsp;&nbsp;&nbsp;&nbsp;-> <a href="https://serilum.com/url/issue-tracker">Issue Tracker</a></p>
<h2>Pull Requests</h2>
<p>Because of the way mod loader files are bundled into one jar, some extra information is needed to do a PR.<br>&nbsp;&nbsp;A wiki page entry about it is available here:</p>
<p>&nbsp;&nbsp;&nbsp;&nbsp;-> <a href="https://serilum.com/url/pull-requests">Pull Request Information</a></p>
<h2>Mod Description</h2>
<p style="text-align:center"><a href="https://serilum.com/" target="_blank" rel="nofollow"><img src="https://github.com/Serilum/.cdn/raw/main/description/header/header.png" alt="" width="838" height="400"></a></p>
<p style="text-align:center"><a href="https://curseforge.com/members/serilum/projects" target="_blank" rel="nofollow"><img src="https://raw.githubusercontent.com/Serilum/.data-workflow/main/badges/svg/curseforge.svg" width="200"></a> <a href="https://modrinth.com/user/Serilum" target="_blank" rel="nofollow"><img src="https://raw.githubusercontent.com/Serilum/.data-workflow/main/badges/svg/modrinth.svg" width="200"></a> <a href="https://patreon.com/serilum" target="_blank" rel="nofollow"><img src="https://raw.githubusercontent.com/Serilum/.data-workflow/main/badges/svg/patreon.svg" width="200"></a> <a href="https://youtube.com/@serilum" target="_blank" rel="nofollow"><img src="https://raw.githubusercontent.com/Serilum/.data-workflow/main/badges/svg/youtube.svg" width="200"></a></p>
<p><strong><span style="font-size:24px">Requires the library mod&nbsp;<a style="font-size:24px" href="https://curseforge.com/minecraft/mc-mods/collective" target="_blank" rel="nofollow">Collective</a>.</span></strong><br><br><strong>&nbsp;&nbsp;&nbsp;This mod is part of <span style="color:#008000"><a style="color:#008000" href="https://curseforge.com/minecraft/modpacks/the-vanilla-experience" target="_blank" rel="nofollow">The Vanilla Experience</a></span> modpack and <span style="color:#006994"><a style="color:#006994" href="https://curseforge.com/minecraft/mc-mods/serilums-client-bundle" target="_blank" rel="nofollow">Serilum's Client Bundle</a></span> mod.</strong><br><span style="font-size:18px">GUI Clock is a minimalistic client-side mod which shows the time in the GUI on the screen when a clock is in the inventory. It can show in-game time or real time, and can be in the 24 hour format or with AM/PM. It can also show the world's age in days below the time. Instead of showing the time in numbers it's also possible to display the clock icon on the screen instead, can be enabled in the config.<br><br>By default the clock will automatically be lowered when a potion effect is active.</span><br><br>You may also be interested in <span style="color:#f90"><strong><a style="color:#f90" href="https://curseforge.com/minecraft/mc-mods/gui-compass" rel="nofollow">GUI Compass</a></strong></span>.<br><br><br><strong><span style="font-size:20px">Configurable:</span> <span style="color:#008000;font-size:14px"><a style="color:#008000" href="https://github.com/Serilum/.information/wiki/how-to-configure-mods" rel="nofollow">(&nbsp;how do I configure?&nbsp;)</a></span><br></strong><strong>mustHaveClockInInventoryForGameTime</strong>&nbsp;(default = true):&nbsp;When enabled, will only show the game time when a clock is present in the inventory.<br><strong>mustHaveClockInInventoryForRealTime</strong>&nbsp;(default = true):&nbsp;When enabled, will only show the real time when a clock is present in the inventory.<br><strong>lowerClockWhenPlayerHasEffects</strong>&nbsp;(default = true): Whether the clock in the GUI should be lowered when the player has potion effects to prevent overlap.<br><strong>_24hourformat</strong>&nbsp;(default = true):&nbsp;Sets the format of the clock to the 24-hour format.<br><br><strong>showOnlyMinecraftClockIcon</strong>&nbsp;(default = false): When enabled, shows the clock item icon instead of a clock with numbers. When using Quark, the "Clock Nerf" feature must be disabled for this to work.<br><br><strong>showBothTimes</strong>&nbsp;(default = false): Show both in-game time and real local time.<br><strong>showRealTime</strong>&nbsp;(default = false):&nbsp;Show actual local time instead of in-game time.<br><strong>showRealTimeSeconds</strong>&nbsp;(default = false):&nbsp;Show the seconds in the clock.<br><strong>showDaysPlayedWorld</strong>&nbsp;(default = true): Show the days played in the world.<br><br><strong>clockPositionIsLeft</strong>&nbsp;(default = false):&nbsp;Places the GUI clock on the left.<br><strong>clockPositionIsCenter</strong>&nbsp;(default = false):&nbsp;Places the GUI clock in the middle.<br><strong>clockPositionIsRight</strong>&nbsp;(default = true):&nbsp;Places the GUI clock on the right.<strong><br><br>clockHeightOffset</strong>&nbsp;(default = 5, min 0, max 3000):&nbsp;The vertical offset (y coord) for the Clock. This determines how far down the time should be on the screen. Can be changed to prevent GUIs from overlapping.<br><strong>clockWidthOffset</strong>&nbsp;(default = 0, min -3000, max 3000):&nbsp;The horizontal offset (x coord) for the Clock.<br><br><strong>drawTextShadow</strong> (default = true): If the text displayed should have a shadow drawn below it.<br><strong>RGB_R</strong>&nbsp;(default = 255, min 0, max 255):&nbsp;The red RGB value for the clock.<br><strong>RGB_G</strong>&nbsp;(default = 255, min 0, max 255):&nbsp;The green RGB value for the clock.<br><strong>RGB_B</strong>&nbsp;(default = 255, min 0, max 255):&nbsp;The blue RGB value for the clock.<br><br><br><strong>The 24-hour clock.</strong><br><picture><img src="https://github.com/Serilum/.cdn/raw/main/projects/gui-clock/a.gif" width="356" height="52"></picture><br><br><strong>The 12-hour clock.</strong><br><picture><img src="https://github.com/Serilum/.cdn/raw/main/projects/gui-clock/b.gif" width="380" height="52"></picture><br><br><strong>The 24 hour clock with the PC's local time next to it.</strong><br><picture><img src="https://github.com/Serilum/.cdn/raw/main/projects/gui-clock/c.gif" width="380" height="56"></picture><br><br><strong>The day counter:</strong><br><picture><img src="https://github.com/Serilum/.cdn/raw/main/projects/gui-clock/d.jpg" width="319" height="160"></picture><br><br><strong>And with the config option '<em>showOnlyMinecraftClockIcon</em>' enabled:<br><picture><img src="https://github.com/Serilum/.cdn/raw/main/projects/gui-clock/e.jpg" width="736" height="166"></picture><br><br>With the config option 'lowerClockWhenPlayerHasEffects' enabled, the clock will automatically be lowered when a potion effect is active:<br><picture><img src="https://github.com/Serilum/.cdn/raw/main/projects/gui-clock/f.gif" width="614" height="476"></picture></strong></p>
<p><br>------------------<br><br><span style="font-size:24px"><strong>You may freely use this mod in any modpack, as long as the download remains hosted within the CurseForge or Modrinth ecosystem.</strong></span><br><br><span style="font-size:18px"><a style="font-size:18px;color:#008000" href="https://serilum.com/" rel="nofollow">Serilum.com</a> contains an overview and more information on all mods available.</span><br><br><span style="font-size:14px">Comments are disabled as I'm unable to keep track of all the separate pages on each mod.</span><span style="font-size:14px"><br>For issues, ideas, suggestions or anything else there is the&nbsp;<a style="font-size:14px;color:#008000" href="https://github.com/Serilum/.issue-tracker" rel="nofollow">Github repo</a>. Thanks!</span><span style="font-size:6px"><br><br></span></p>
<p style="text-align:center"><a href="https://serilum.com/donate" rel="nofollow"><img src="https://github.com/Serilum/.cdn/raw/main/description/projects/support.svg" alt="" width="306" height="50"></a></p>