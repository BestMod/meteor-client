package minegame159.meteorclient.modules.misc;
        import minegame159.meteorclient.modules.Category;
        import minegame159.meteorclient.modules.ToggleModule;
        import net.minecraft.util.Util;

        public class StarGithub extends ToggleModule {

            public StarGithub(){
                super(Category.Misc, "star-github", "Star my github if u think this hak is poger");
            }

            public void onActivate() {
                try {
                    Util.getOperatingSystem().open("https://github.com/BestMod/meteor-client-platinum-edition");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }