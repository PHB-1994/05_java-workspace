package edu.oop.method.ex;

public class RPGGameWuthoutMethods {
    //// 전사 등급 계산 -> grade 함수명칭 중복코드 기능으로 분리 후 적용

        public static void main(String[] args) {
            // 전사 캐릭터 처리
            String warrior = "용감한 전사";
            int warriorLevel = 15;
            int warriorStr = 80;
            int warriorDef = 60;
            int warriorMagic = 20;

            // 전사 총 스탯 계산
            int warriorTotal = warriorStr + warriorDef + warriorMagic;

            // 전사 전투력 계산
            int warriorPower = (warriorStr * 2) + warriorDef + (warriorMagic / 2);

            // 전사 등급 계산
            String warriorRank = jobRank(warriorPower);

            // 전사 정보 출력
            info(warrior,warriorLevel,warriorStr,warriorDef,warriorMagic,warriorTotal,warriorPower,warriorRank);
//            System.out.println("🗡️ " + warrior + " (레벨 " + warriorLevel + ")");
//            System.out.println("힘: " + warriorStr + " | 방어: " + warriorDef + " | 마법: " + warriorMagic);
//            System.out.println("총 스탯: " + warriorTotal + " | 전투력: " + warriorPower);
//            System.out.println("등급: " + warriorRank);
//            System.out.println();


            // 마법사 캐릭터 처리 (완전히 동일한 로직)
            String mage = "현명한 마법사";
            int mageLevel = 12;
            int mageStr = 30;
            int mageDef = 40;
            int mageMagic = 95;

            // 마법사 총 스탯 계산
            int mageTotal = mageStr + mageDef + mageMagic;

            // 마법사 전투력 계산 (동일한 공식)
            int magePower = (mageStr * 2) + mageDef + (mageMagic / 2);

            // 마법사 등급 계산 (동일한 기준)
            String mageRank = jobRank(magePower);


            // 마법사 정보 출력 (동일한 형식)
            info(mage,mageLevel,mageStr,mageDef,mageMagic,mageTotal,magePower,mageRank);


            // 도적 캐릭터 처리 (또 다시 중복)
            String thief = "민첩한 도적";
            int thiefLevel = 18;
            int thiefStr = 55;
            int thiefDef = 45;
            int thiefMagic = 35;

            // 도적 총 스탯 계산
            int thiefTotal = thiefStr + thiefDef + thiefMagic;

            // 도적 전투력 계산 (또 다시 동일한 공식)
            int thiefPower = (thiefStr * 2) + thiefDef + (thiefMagic / 2);

            // 도적 등급 계산 (또 다시 동일한 기준)
            String thiefRank = jobRank(thiefPower);


            // 도적 정보 출력 (또 다시 동일한 형식)
            info(thief,thiefLevel,thiefStr,thiefDef,thiefMagic,thiefTotal,thiefPower,thiefRank);


            // 파티 전체 정보
            System.out.println("🎮 파티 정보 🎮");
            System.out.println("파티원 수: 3명");
            System.out.println("평균 레벨: " + (warriorLevel + mageLevel + thiefLevel) / 3);
            System.out.println("총 전투력: " + (warriorPower + magePower + thiefPower));

            // 최강 캐릭터 찾기
            if (warriorPower >= magePower && warriorPower >= thiefPower) {
                System.out.println("최강 캐릭터: " + warrior + " (전투력: " + warriorPower + ")");
            } else if (magePower >= warriorPower && magePower >= thiefPower) {
                System.out.println("최강 캐릭터: " + mage + " (전투력: " + magePower + ")");
            } else {
                System.out.println("최강 캐릭터: " + thief + " (전투력: " + thiefPower + ")");
            }
        }

        public static String jobRank(int power){

            if (power >= 200) {
                return "전설급";
            } else if (power >= 150) {
                return "영웅급";
            } else if (power >= 100) {
                return "고수급";
            } else {
                return "초보급";
            }
        }

        public static void info(String job, int level, int str, int def, int magic, int total, int power, String rank){
            System.out.println("🗡️ " + job + " (레벨 " + level + ")");
            System.out.println("힘: " + str + " | 방어: " + def + " | 마법: " + magic);
            System.out.println("총 스탯: " + total + " | 전투력: " + power);
            System.out.println("등급: " + rank);
            System.out.println();
        }

}
