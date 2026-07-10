# Rainforest Ecosystem & Kongra

A Fabric mod for Minecraft 1.20.1 that adds a deadly rainforest ecosystem.

## What this mod does

- **Deadly Rain**: If you stand out in the rain (with the sky open above you, in a warm biome like a jungle) for a long period without shelter, you will begin to lose life. Staying exposed longer increases the damage.
- **KONGRA Armor**: The only thing that saves you. Wear the FULL set (helmet, chestplate, leggings, boots) and you become immune to the deadly rain. The armor is meant to be crafted from the rarest rainforest materials (King Cobra Scales, Gorilla Hide, Kongra Core, Rainforest Essence).
- **Rainforest Animals**: Jaguars and Toucans roam the world.
- **The Big Boss — KONGRA**: A towering beast with the body of a Gorilla and the head of a King Cobra. 300 HP, poisons you on hit, and shows a boss bar. Without KONGRA armor, you don't stand a chance.

Use the creative tab "Rainforest & Kongra" or the spawn eggs to find all the content.

---

## How to build the mod .jar for FREE using GitHub (no Java install needed!)

You do **not** need to install Java or any developer tools. GitHub will build the mod for you in the cloud.

Follow these steps carefully:

1. **Create a GitHub account** at https://github.com (free).
2. Click the **+** in the top-right corner → **New repository**. Give it any name, set it to Public or Private, and click **Create repository**.
3. On the new empty repository page, click the link **"uploading an existing file"**.
4. **Extract the ZIP** you downloaded of this project so you can see its contents in a folder.
5. **IMPORTANT (macOS users)**: The `.github` folder is HIDDEN by default in Finder. If you do not upload it, the build will NEVER run.
   - Open the extracted folder in Finder.
   - Press **Cmd + Shift + .** (Command, Shift, and the period key) to reveal hidden files.
   - You should now see the `.github` folder appear.
6. Open the extracted folder and select **ALL files and folders INSIDE it** — including the hidden `.github` folder, `src`, `build.gradle`, `gradle.properties`, `settings.gradle`, `README.md`, etc.
   - **Drag the CONTENTS of the folder into GitHub, NOT the folder itself.** (Do not drag the outer folder — drag everything inside it.)
7. Drop them onto the GitHub upload page.
8. Scroll down and click **Commit changes**.
9. Click the **Actions** tab at the top of your repository.
10. You will see a workflow named **Build** running. Wait about **2 minutes** for it to finish (green checkmark).
11. Click into the completed run, scroll down to **Artifacts**, and download **mod-jar**.
12. Unzip the downloaded artifact to get the `.jar` file.
13. Copy the `.jar` into your Minecraft mods folder:
    - Windows: `%appdata%\.minecraft\mods`
    - macOS: `~/Library/Application Support/minecraft/mods`
    - Linux: `~/.minecraft/mods`
14. Make sure you have **Fabric Loader** and **Fabric API** installed for Minecraft 1.20.1, then launch the game.

### ⚠️ macOS Warning
On macOS the `.github` folder is invisible in Finder by default. You **must** press **Cmd + Shift + .** in Finder to show hidden files before selecting them, otherwise the `.github` folder won't be uploaded, the GitHub Action will never run, and no `.jar` will be built.

---

## Notes
- Requires Fabric Loader 0.15.11+ and Fabric API for Minecraft 1.20.1.
- Textures are referenced by the mod; if a texture is missing, Minecraft shows the default magenta/black placeholder, which is harmless.